package config;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class env {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected static String username = "Admin";
    protected static String password = "admin123";
    public static Faker faker = new Faker();
    // untuk random nama
//    public String fakerUsername(){
//        String createUsername = faker.name().username();
//        return createUsername;
//    }
    protected static String fakerUsername = faker.name().username();
    protected static String createPassword = "P@ssw0rd123";
    protected static String validateUsername;
}
