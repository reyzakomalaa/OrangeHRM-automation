package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.pageHome;
import object.pagePIM;
import object.reuseableObject;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class home extends env {
    pageHome elementHome = new pageHome();
    pagePIM elementPIM = new pagePIM();
    reuseableObject elementReuseable = new reuseableObject();
    @When("user click PIM")
    public void user_click_pim() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnPIM()));

        driver.findElement(elementHome.getBtnPIM()).click();
    }

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
//        saveFirstName = driver.findElement(elementPIM.getFieldFirstName()).getText();
//        System.out.println(saveFirstName);
    }

    @And("user fill Last Name")
    public void user_fill_last_name() {
        driver.findElement(elementPIM.getFieldLastName()).sendKeys(randomLastName);
//        saveLastName = driver.findElement(elementPIM.getFieldLastName()).getText();
//        System.out.println(saveLastName);
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementPIM.getTxtEmployeeName()));

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

        driver.findElement(elementPIM.getFieldUsername()).sendKeys(fakerUsername());
    }

    @And("user select status Enabled")
    public void userSelectStatusEnabled() {
        driver.findElement(elementPIM.getRadioEnabled()).click();
    }

    @And("user fill Password")
    public void userFillPassword() {
        driver.findElement(elementPIM.getFieldPassword()).sendKeys(userPassword);
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
    public void userChangeNationality() throws InterruptedException {
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
    public void userChangeMaritalStatus() throws InterruptedException {
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
