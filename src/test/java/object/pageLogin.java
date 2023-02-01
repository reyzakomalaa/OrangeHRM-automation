package object;

import org.openqa.selenium.By;

public class pageLogin {
    By fieldUsername = By.xpath("//input[@name = 'username']");

    public By getFieldUsername() {
        return fieldUsername;
    }
    By fieldPassword = By.xpath("//input[@name = 'password']");

    public By getFieldPassword() {
        return fieldPassword;
    }
    By btnLogin = By.xpath("//button[@type = 'submit']");

    public By getBtnLogin() {
        return btnLogin;
    }
}
