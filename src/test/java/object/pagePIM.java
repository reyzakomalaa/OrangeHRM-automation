package object;

import org.openqa.selenium.By;

public class pagePIM {
    By btnAddEmployee = By.xpath("//a[contains(text(), 'Add Employee')]");

    public By getBtnAddEmployee() {
        return btnAddEmployee;
    }
    By fieldFirstName = By.xpath("//input[@name = 'firstName']");

    public By getFieldFirstName() {
        return fieldFirstName;
    }
    By fieldLastName = By.xpath("//input[@name = 'lastName']");

    public By getFieldLastName() {
        return fieldLastName;
    }
    By btnSave = By.xpath("//button[@type = 'submit']");

    public By getBtnSave() {
        return btnSave;
    }
    By btnCancel = By.xpath("//div[@class = 'oxd-form-actions']//button[1]");

    public By getBtnCancel() {
        return btnCancel;
    }
    By txtEmployeeName = By.xpath("//div[@class = 'orangehrm-edit-employee-name']//h6");

    public By getTxtEmployeeName() {
        return txtEmployeeName;
    }
}
