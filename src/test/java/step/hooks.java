package step;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class hooks extends env {
    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://employee.sdcillsy.my.id/");
        driver.manage().window().maximize();
    }

    @After
    public void after(){
        driver.quit();
    }
}
