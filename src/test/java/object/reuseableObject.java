package object;

import org.openqa.selenium.By;

public class reuseableObject {
    By toastSuccess = By.id("oxd-toaster_1");

    public By getToastSuccess() {
        return toastSuccess;
    }
}
