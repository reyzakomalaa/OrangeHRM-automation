package object;

import org.openqa.selenium.By;

public class pageLogin {
    By logoCompany = By.xpath("//*[@alt = 'company-branding']");

    public By getLogoCompany() {
        return logoCompany;
    }
    By fieldUsername = By.xpath("//*[@name = 'username']");

    public By getFieldUsername() {
        return fieldUsername;
    }
    By fieldPassword = By.xpath("//*[@type = 'password']");

    public By getFieldPassword() {
        return fieldPassword;
    }
    By btnLogin = By.xpath("//*[@type = 'submit']");

    public By getBtnLogin() {
        return btnLogin;
    }
}
