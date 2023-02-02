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
    @When("user click PIM")
    public void user_click_pim() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnPIM()));

        driver.findElement(elementHome.getBtnPIM()).click();
    }

    @When("user click Time")
    public void userClickTime() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnTime()));

        driver.findElement(elementHome.getBtnTime()).click();
    }
}
