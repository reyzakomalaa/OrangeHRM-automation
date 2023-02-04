package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.pageTime;
import object.reuseableObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;

public class time extends env {
    pageTime elementTime = new pageTime();
    reuseableObject elementReuseable = new reuseableObject();
    @And("user click Attendance")
    public void userClickAttendance() {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(elementTime.getBtnAttendance()));

        driver.findElement(elementTime.getBtnAttendance()).click();
    }

    @And("user click Punch In OR Out")
    public void userClickPunchInOROut() {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(elementTime.getBtnPunchInOut()));

        driver.findElement(elementTime.getBtnPunchInOut()).click();
    }

    @And("user click In")
    public void userClickIn() {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(elementTime.getBtnPunch()));

        WebElement title = driver.findElement(elementTime.getTxtPunch());

        if ("Punch In".equals(title.getText())){
            driver.findElement(elementTime.getBtnPunch()).click();
        } else {
            System.out.println("Anda harus melakukan Punch Out terlebih dahulu, jika ingin melakukan Punch In");
            driver.quit();
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
        wait.until(ExpectedConditions.elementToBeClickable(elementTime.getBtnPunch()));

        WebElement title = driver.findElement(elementTime.getTxtPunch());

        if ("Punch Out".equals(title.getText())){
            driver.findElement(elementTime.getBtnPunch()).click();
        } else {
            System.out.println("Anda harus melakukan Punch In terlebih dahulu, jika ingin melakukan Punch Out");
            driver.quit();
        }
    }

    @When("user select Date")
    public void userSelectDate() {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(elementTime.getFieldDate()));

        SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
        String dateToday = DateFor.format(date);

        driver.findElement(elementTime.getFieldDate()).sendKeys(dateToday);
    }

    @And("user select Time")
    public void userSelectTime() throws InterruptedException {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(elementTime.getFieldTime()));

        SimpleDateFormat DateFor = new SimpleDateFormat("hh:mm a");
        String timeNow = DateFor.format(date);
        saveTimeAM_OR_PM = timeNow.substring(6);

        SimpleDateFormat getHourMinute = new SimpleDateFormat("hh:mm");
        String resultHourMinute = getHourMinute.format(date);

        String[] result = resultHourMinute.split(":", 2);
        String hour = result[0];
        String minute = result[1];

        Thread.sleep(3000);

        driver.findElement(elementTime.getFieldTime()).click();
        driver.findElement(elementTime.getSelectTimeHour()).sendKeys(hour);
        driver.findElement(elementTime.getSelectTimeMinute()).sendKeys(minute);
        driver.findElement(elementTime.selectTimeAM_OR_PM(saveTimeAM_OR_PM));
    }

    @When("user fill Note")
    public void userFillNote() throws InterruptedException {
        //Menggunakan sleep karena UI yang sangat slow response
        Thread.sleep(8500);

        WebElement title = driver.findElement(elementTime.getTxtPunch());

        if ("Punch In".equals(title.getText())){
            driver.findElement(elementTime.getFieldNote()).sendKeys("Absen Masuk");
        } else if ("Punch Out".equals(title.getText())){
            driver.findElement(elementTime.getFieldNote()).sendKeys("Absen Pulang");
        }
    }
}
