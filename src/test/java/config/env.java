package config;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class env {
    //Fungsi faker hanya bisa digunakan di class ini saja
    Faker faker = new Faker();

    //Fungsi random disimpan secara Global
    public static Random random = new Random();
    public static WebDriver driver;
    public static WebDriverWait wait;
    public String adminUsername = "Admin";
    public String adminPassword = "admin123";

    //Untuk random yang hasilnya selalu sama untuk 1x run semua test case secara bersamaan
    public String randomFirstName = faker.name().firstName();
    public String randomLastName = faker.name().lastName();
    public String randomUsername = faker.name().username();

    //Untuk random yang hasilnya selalu berbeda untuk 1x run semua test case secara bersamaan
//    public String fakerFirstName(){
//        String randomFirstName = faker.name().firstName();
//        return randomFirstName;
//    }
//    public String fakerLastName(){
//        String randomLastName = faker.name().lastName();
//        return randomLastName;
//    }
//    public String fakerUsername(){
//        String randomUsername = faker.name().username();
//        return randomUsername;
//    }
    public String userPassword = "P@ssw0rd123";
    public int randomList;
    public int randomGender;

    //Simpan element locator kedalam String untuk random 2 object
    public String radioMale = "//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span";
    public String radioFemale = "//*[@id = 'app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span";
}
