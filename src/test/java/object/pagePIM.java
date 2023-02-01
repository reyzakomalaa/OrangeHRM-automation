package object;

import config.env;
import org.openqa.selenium.By;

public class pagePIM extends env {
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
    By toggleLoginDetails = By.xpath("//span[@class = 'oxd-switch-input oxd-switch-input--active --label-right']");

    public By getToggleLoginDetails() {
        return toggleLoginDetails;
    }
    By fieldUsername = By.xpath("//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");

    public By getFieldUsername() {
        return fieldUsername;
    }
    By radioEnabled = By.xpath("//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label/span");

    public By getRadioEnabled() {
        return radioEnabled;
    }
    By radioDisabled = By.xpath("//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/label/span");

    public By getRadioDisabled() {
        return radioDisabled;
    }
    By fieldPassword = By.xpath("//div[@class = 'oxd-grid-item oxd-grid-item--gutters user-password-cell']/div/div[2]/input");

    public By getFieldPassword() {
        return fieldPassword;
    }
    By fieldConfirmPassword = By.xpath("//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");

    public By getFieldConfirmPassword() {
        return fieldConfirmPassword;
    }
    By iconPencil = By.xpath("//div[@class = 'oxd-table-body']/div[1]/div/div[9]/div/button[2]/i");

    public By getIconPencil() {
        return iconPencil;
    }
    By dropdownNationality = By.xpath("//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i");

    public By getDropdownNationality() {
        return dropdownNationality;
    }
    By dropdownMaritalStatus = By.xpath("//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i");

    public By getDropdownMaritalStatus() {
        return dropdownMaritalStatus;
    }

    //Untuk combine/custom xpath dengan String
    public By getListRandom(int randomList) {
        By listNationality = By.xpath("//div[@role = 'listbox']/div[" + randomList + "]");
        return listNationality;
    }

    //Untuk random 2 Object, maka element locator disimpan dalam bentuk string di config/env
//    By radioMale = By.xpath("//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span");
//
//    public By getRadioMale() {
//        return radioMale;
//    }
//    By radioFemale = By.xpath("//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span");
//
//    public By getRadioFemale() {
//        return radioFemale;
//    }

    public By getRandomGender() {
        //Random String
        String [] gender = {String.valueOf(radioMale), String.valueOf(radioFemale)};
        int select = random.nextInt(gender.length);

        By randomGender = By.xpath(gender[select]);
        return randomGender;
    }

}
