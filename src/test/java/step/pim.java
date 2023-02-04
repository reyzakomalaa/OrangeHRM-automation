package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.pagePIM;
import object.reuseableObject;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class pim extends env {
    pagePIM elementPIM = new pagePIM();
    reuseableObject elementReuseable = new reuseableObject();
    @And("user click Add")
    public void user_click_add() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementPIM.getBtnAddEmployee()));

        driver.findElement(elementPIM.getBtnAddEmployee()).click();
    }

    @And("user fill Full Name")
    public void user_fill_full_name() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementPIM.getFieldFirstName()));

        driver.findElement(elementPIM.getFieldFirstName()).sendKeys(randomFirstName);
    }

    @And("user fill Last Name")
    public void user_fill_last_name() {
        driver.findElement(elementPIM.getFieldLastName()).sendKeys(randomLastName);
    }

    @And("user click Save")
    public void user_click_save() {
        driver.findElement(elementPIM.getBtnSave()).click();
    }

    @Then("user success create new Employee")
    public void user_success_create_new_employee() {
        String verifyName;
        String savedName = randomFirstName + " " + randomLastName;

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(elementPIM.getTxtEmployeeName(), savedName));

        verifyName = driver.findElement(elementPIM.getTxtEmployeeName()).getText();
        Assert.assertEquals(verifyName, savedName);
    }

    @When("user enable Login Details toggle")
    public void userEnableLoginDetailsToggle() {
        driver.findElement(elementPIM.getToggleLoginDetails()).click();
    }

    @And("user fill Username")
    public void userFillUsername() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementPIM.getFieldUsername()));

        driver.findElement(elementPIM.getFieldUsername()).sendKeys(randomUsername);

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/username.txt", false);
            writer.write(randomUsername + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @And("user select status Enabled")
    public void userSelectStatusEnabled() {
        driver.findElement(elementPIM.getRadioEnabled()).click();
    }

    @And("user fill Password")
    public void userFillPassword() {
        driver.findElement(elementPIM.getFieldPassword()).sendKeys(userPassword);

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/password.txt", false);
            writer.write(userPassword + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @And("user fill Confirm Password")
    public void userFillConfirmPassword() {
        driver.findElement(elementPIM.getFieldConfirmPassword()).sendKeys(userPassword);
    }

    @And("user click Pencil icon")
    public void userClickPencilIcon() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementPIM.getIconPencil()));

        driver.findElement(elementPIM.getIconPencil()).click();
    }

    @And("user change Nationality")
    public void userChangeNationality() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementPIM.getDropdownNationality()));

        //Random Number
        int max = 194;
        int min = 1;
        Random random = new Random();
        randomList = random.nextInt(max - min + 1) + min;

        driver.findElement(elementPIM.getDropdownNationality()).click();

        wait.until(ExpectedConditions.elementToBeClickable(elementPIM.getListRandom(randomList)));
        driver.findElement(elementPIM.getListRandom(randomList)).click();
    }

    @And("user change Marital Status")
    public void userChangeMaritalStatus() {
        //Random Number
        int max = 4;
        int min = 1;
        Random random = new Random();
        randomList = random.nextInt(max - min + 1) + min;

        driver.findElement(elementPIM.getDropdownMaritalStatus()).click();

        wait.until(ExpectedConditions.elementToBeClickable(elementPIM.getListRandom(randomList)));
        driver.findElement(elementPIM.getListRandom(randomList)).click();
    }

    @And("user change Gender")
    public void userChangeGender() {
        driver.findElement(elementPIM.getRandomGender()).click();
    }

    @Then("user success change Profile")
    public void userSuccessChangeProfile() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementReuseable.getToastSuccess()));

        driver.findElement(elementReuseable.getToastSuccess()).isDisplayed();
    }
}
