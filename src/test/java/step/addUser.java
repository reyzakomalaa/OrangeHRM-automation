package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addUser extends env {
    pageHome elementHome = new pageHome();
    @When("user click Admin menu")
    public void user_click_admin_menu() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.getNavbarAdmin()));
        driver.findElement(elementHome.getNavbarAdmin()).click();
    }
    @And("user click Add button")
    public void user_click_add_button() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAdd()));
        driver.findElement(elementHome.getBtnAdd()).click();
    }
    @And("user select User Role")
    public void user_select_user_role() throws InterruptedException {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getClickUserRole()));
        driver.findElement(elementHome.getClickUserRole()).click();
        Thread.sleep(2000);
        driver.findElement(elementHome.getChooseUserRole()).click();
    }
    @And("user select Employee Name")
    public void user_select_employee_name() throws InterruptedException {
        driver.findElement(elementHome.getBtnEmployeeName()).sendKeys("Pa");
        Thread.sleep(2000);
        driver.findElement(elementHome.getSelectEmployeeName()).click();
    }
    @And("user select Status")
    public void user_select_status() throws InterruptedException {
        driver.findElement(elementHome.getClickStatus()).click();
        Thread.sleep(2000);
        driver.findElement(elementHome.getChooseStatus()).click();
    }
    @And("user create username")
    public void user_create_username() throws InterruptedException {
        driver.findElement(elementHome.getInputUsername()).sendKeys(fakerUsername);
        Thread.sleep(2000);
    }
    @And("user create password")
    public void user_create_password() {
        driver.findElement(elementHome.getInputPassword()).sendKeys(createPassword);
    }
    @And("user fill confirm password")
    public void user_fill_confirm_password() {
        driver.findElement(elementHome.getInputConfirmPassword()).sendKeys(createPassword);
    }
    @And("user click Save")
    public void user_click_save() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAddUser()));
        driver.findElement(elementHome.getBtnAddUser()).click();
    }
    @Then("success Add User")
    public void success_add_user() throws InterruptedException {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getSearchByUsername()));
        driver.findElement(elementHome.getSearchByUsername()).sendKeys(fakerUsername);
        driver.findElement(elementHome.getBtnSearch()).click();
        Thread.sleep(5000);
    }
}
