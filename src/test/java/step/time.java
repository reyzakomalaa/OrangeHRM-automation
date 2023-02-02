package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import object.pageTime;
import object.reuseableObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class time extends env {
    pageTime elementTime = new pageTime();
    reuseableObject elementReuseable = new reuseableObject();
    @And("user click Attendance")
    public void userClickAttendance() {
        driver.findElement(elementTime.getBtnAttendance()).click();
    }

    @And("user click Punch In OR Out")
    public void userClickPunchInOROut() {
        driver.findElement(elementTime.getBtnPunchInOut()).click();
    }

    @And("user click In")
    public void userClickIn() {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBe(elementTime.getTxtPunch(), "Punch In"));

        WebElement title = driver.findElement(elementTime.getTxtPunch());

        if ("Punch In".equals(title.getText())){
            wait.until(ExpectedConditions.elementToBeClickable(elementTime.getBtnPunch()));
            driver.findElement(elementTime.getBtnPunch()).click();
        }else {
            System.out.println("Anda harus melakukan Punch In terlebih dahulu, sebelum melakukan Punch Out");
        }
    }

    @Then("user success Punch In OR Out")
    public void userSuccessPunchInOROut() {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementReuseable.getToastSuccess()));

        driver.findElement(elementReuseable.getToastSuccess()).isDisplayed();
    }

    @And("user click Out")
    public void userClickOut() {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBe(elementTime.getTxtPunch(), "Punch Out"));

        WebElement title = driver.findElement(elementTime.getTxtPunch());

        if ("Punch Out".equals(title.getText())){
            wait.until(ExpectedConditions.elementToBeClickable(elementTime.getBtnPunch()));
            driver.findElement(elementTime.getBtnPunch()).click();
        }else {
            System.out.println("Anda harus melakukan Punch Out terlebih dahulu, jika ingin melakukan Punch In");
        }
    }
}
