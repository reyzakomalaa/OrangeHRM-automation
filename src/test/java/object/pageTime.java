package object;

import org.openqa.selenium.By;

public class pageTime {
    By btnAttendance = By.xpath("//span[contains(text(), 'Attendance ')]");

    public By getBtnAttendance() {
        return btnAttendance;
    }
    By btnPunchInOut = By.xpath("//a[contains(text(), 'Punch In/Out')]");

    public By getBtnPunchInOut() {
        return btnPunchInOut;
    }
    By txtPunch = By.xpath("//h6[@class = 'oxd-text oxd-text--h6 orangehrm-main-title']");

    public By getTxtPunch() {
        return txtPunch;
    }
    By btnPunch = By.xpath("//button[@type = 'submit']");

    public By getBtnPunch() {
        return btnPunch;
    }
    By fieldDate = By.xpath("//input[@placeholder = 'yyyy-mm-dd']");

    public By getFieldDate() {
        return fieldDate;
    }
    By fieldTime = By.xpath("//div[@class = 'oxd-time-input']/i");

    public By getFieldTime() {
        return fieldTime;
    }
    By selectTimeHour = By.xpath("//input[@class = 'oxd-input oxd-input--active oxd-time-hour-input-text']");

    public By getSelectTimeHour() {
        return selectTimeHour;
    }
    By selectTimeMinute = By.xpath("//input[@class = 'oxd-input oxd-input--active oxd-time-minute-input-text']");

    public By getSelectTimeMinute() {
        return selectTimeMinute;
    }

    public By selectTimeAM_OR_PM(String saveTimeAM_OR_PM){
        By timeAMPM = By.xpath("//input[@name = '" + saveTimeAM_OR_PM + "']");
        return timeAMPM;
    }
    By fieldNote = By.xpath("//textarea");

    public By getFieldNote() {
        return fieldNote;
    }
}
