package config;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class env {
    Faker faker = new Faker();
    public static WebDriver driver;
    public static WebDriverWait wait;
    public String adminUsername = "Admin";
    public String adminPassword = "s3Kol4HQA!*";
    public String randomFirstName = faker.name().firstName();
    public String randomLastName = faker.name().lastName();
//    public String fakerFirstName(){
//        String randomFirstName = faker.name().firstName();
//        return randomFirstName;
//    }
//    public String fakerLastName(){
//        String randomLastName = faker.name().lastName();
//        return randomLastName;
//    }

}
