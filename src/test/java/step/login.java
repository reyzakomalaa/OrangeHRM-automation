package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.pageLogin;
import object.pageHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class login extends env {
    pageLogin elementLogin = new pageLogin();
    pageHome elementHome = new pageHome();
    @Given("user is in Login page")
    public void user_is_in_login_page() {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(elementLogin.getBtnLogin()));

        driver.findElement(elementLogin.getFieldUsername()).isDisplayed();
        driver.findElement(elementLogin.getFieldPassword()).isDisplayed();
        driver.findElement(elementLogin.getBtnLogin()).isDisplayed();
    }

    @When("user input Admin username")
    public void userInputAdminUsername() {
        driver.findElement(elementLogin.getFieldUsername()).sendKeys(adminUsername);
    }

    @And("user input Admin password")
    public void userInputAdminPassword() {
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

    @When("user input Employee username")
    public void userInputEmployeeUsername() throws InterruptedException {
        WebElement username = driver.findElement(elementLogin.getFieldUsername());
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/username.txt"));
            while (read.hasNextLine()) {
                String savedUsername = read.nextLine();

                Thread.sleep(2000);
                username.sendKeys(savedUsername);
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @And("user input Employee password")
    public void userInputEmployeePassword() throws InterruptedException {
        WebElement password = driver.findElement(elementLogin.getFieldPassword());
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/password.txt"));
            while (read.hasNextLine()) {
                String savedUsername = read.nextLine();

                Thread.sleep(2000);
                password.sendKeys(savedUsername);
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
