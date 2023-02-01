package object;

import org.openqa.selenium.By;

public class pageHome {
    By txtDashboard = By.xpath("//h6");

    public By getTxtDashboard() {
        return txtDashboard;
    }
    By btnPIM = By.xpath("//a[@href = '/web/index.php/pim/viewPimModule']");

    public By getBtnPIM() {
        return btnPIM;
    }
}
