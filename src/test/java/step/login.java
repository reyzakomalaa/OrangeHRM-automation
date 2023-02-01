package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.pageLogin;
import object.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login extends env {
    pageLogin elementLogin = new pageLogin();
    pageHome elementHome = new pageHome();
    @Given("user is in Login page")
    public void user_is_in_login_page() {
        driver.findElement(elementLogin.getFieldUsername()).isDisplayed();
        driver.findElement(elementLogin.getFieldPassword()).isDisplayed();
        driver.findElement(elementLogin.getBtnLogin()).isDisplayed();
    }

    @When("user input username")
    public void user_input_username() {
        driver.findElement(elementLogin.getFieldUsername()).sendKeys(adminUsername);
    }

    @And("user input password")
    public void user_input_password() {
        driver.findElement(elementLogin.getFieldPassword()).sendKeys(adminPassword);
    }

    @And("user click Login")
    public void user_click_login() {
        driver.findElement(elementLogin.getBtnLogin()).click();
    }

    @Then("user success Login")
    public void user_success_login() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.getTxtDashboard()));

        driver.findElement(elementHome.getTxtDashboard()).isDisplayed();
    }
}
