package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import object.pageLogin;
import object.pageHome;

public class login extends env {
    pageLogin elementLogin = new pageLogin();
    pageHome elementHome = new pageHome();
    @Given("user is in Login page")
    public void user_is_in_login_page() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLogin.getLogoCompany()));
        driver.findElement(elementLogin.getLogoCompany()).isDisplayed();
    }
    @When("user input username")
    public void user_input_username() {
        driver.findElement(elementLogin.getFieldUsername()).sendKeys(username);
    }
    @And("user input password")
    public void user_input_password() {
        driver.findElement(elementLogin.getFieldPassword()).sendKeys(password);
    }
    @And("user click Login button")
    public void user_click_login_button() {
        driver.findElement(elementLogin.getBtnLogin()).click();
    }
    @Then("user is in Home page")
    public void user_is_in_home_page() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.getTxtTimeToWork()));
        driver.findElement(elementHome.getTxtTimeToWork()).isDisplayed();
    }
}
