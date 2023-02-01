package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.pageHome;
import object.pagePIM;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home extends env {
    pageHome elementHome = new pageHome();
    pagePIM elementPIM = new pagePIM();
    @When("user click PIM")
    public void user_click_pim() {
        wait = new WebDriverWait(driver,10);
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

        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementPIM.getTxtEmployeeName()));

        verifyName = driver.findElement(elementPIM.getTxtEmployeeName()).getText();
        Assert.assertEquals(verifyName, savedName);
    }
}
