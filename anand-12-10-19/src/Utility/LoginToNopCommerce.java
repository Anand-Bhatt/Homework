package Utility;

import Utility.Utility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// This programme verify if user can login successfully
public class LoginToNopCommerce {
    private WebDriver driver;
    private Utility util;

    @Before
    // To open browser and web page.
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        util = new Utility(driver);
    }

    @Test
    // To verify if user can login successfully
    public void userShouldLoginSuccessfully() {
        util.clickOnElement(By.linkText("Log in"));
        util.sendTextToElement(By.id("Email"), "abc@gmail.com");
        util.sendTextToElement(By.id("Password"), "abc123");
        util.clickOnElement(By.xpath("//input[@class='button-1 login-button']"));
        util.isElementDisplayed(By.className("ico-logout"));
    }

    @After
    // To pause and quit
    public void closeDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
