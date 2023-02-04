package step;

import config.env;
import io.cucumber.java.en.When;
import object.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @When("user click My Info")
    public void userClickMyInfo() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnMyInfo()));

        driver.findElement(elementHome.getBtnMyInfo()).click();
    }
}
