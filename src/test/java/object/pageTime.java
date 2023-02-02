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
}
