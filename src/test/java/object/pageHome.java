package object;

import org.openqa.selenium.By;

public class pageHome {
    By txtTimeToWork = By.xpath("//*[contains(text(), 'Time at Work')]");

    public By getTxtTimeToWork() {
        return txtTimeToWork;
    }
    By navbarAdmin = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span");

    public By getNavbarAdmin() {
        return navbarAdmin;
    }
    By btnAdd = By.xpath("//*[@class = 'oxd-icon bi-plus oxd-button-icon']");

    public By getBtnAdd() {
        return btnAdd;
    }
    By clickUserRole = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");

    public By getClickUserRole() {
        return clickUserRole;
    }
    By btnEmployeeName = By.xpath("//*[@placeholder = 'Type for hints...']");

    public By getBtnEmployeeName() {
        return btnEmployeeName;
    }
    By clickStatus = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");

    public By getClickStatus() {
        return clickStatus;
    }
    By inputUsername = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");

    public By getInputUsername() {
        return inputUsername;
    }
    By inputPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");

    public By getInputPassword() {
        return inputPassword;
    }
    By inputConfirmPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");

    public By getInputConfirmPassword() {
        return inputConfirmPassword;
    }

    By btnAddUser = By.xpath("//*[@type = 'submit']");

    public By getBtnAddUser() {
        return btnAddUser;
    }
    By selectEmployeeName = By.xpath("//*[contains(text(), 'Paul  Collings')]");

    public By getSelectEmployeeName() {
        return selectEmployeeName;
    }
    By chooseUserRole = By.xpath("//*[contains(text(), 'ESS')]");

    public By getChooseUserRole() {
        return chooseUserRole;
    }
    By chooseStatus = By.xpath("//*[contains(text(), 'Enabled')]");

    public By getChooseStatus() {
        return chooseStatus;
    }
    By searchByUsername = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");

    public By getSearchByUsername() {
        return searchByUsername;
    }
    By btnSearch = By.xpath("//*[@type = 'submit']");

    public By getBtnSearch() {
        return btnSearch;
    }
    By verifyRegisteredUsername = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]");

    public By getVerifyRegisteredUsername() {
        return verifyRegisteredUsername;
    }
}
