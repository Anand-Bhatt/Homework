package Utility;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

// This programme verify if user can login successfully
public class RegisterToNopCommerce {
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
    public void navigateToRegisterPageSuccessfully() {
        util.clickOnElement(By.className("ico-register"));
        util.isElementDisplayed(By.linkText("Register"));

    }

    @Test
    public void completeRegistrationFormSuccessfully() {
        util.clickOnElement(By.className("ico-register"));
        util.clickOnElement(By.id("gender-male"));
        util.sendTextToElement(By.id("FirstName"), "Anand");
        util.sendTextToElement(By.id("LastName"), "Bhatt");

        util.dropDownMenuByValue(By.xpath("//select[@name='DateOfBirthDay']"), "4");
        util.dropDownMenuByIndex(By.xpath("//select[@name='DateOfBirthMonth']"), 6);
        util.dropDownMenuByText(By.xpath("//select[@name='DateOfBirthYear']"), "1978");

        // To generate different email addresses
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String randomEmail = "abc" + randomInt + "@gmail.com";
        util.sendTextToElement(By.xpath("//input[@id='Email']"), randomEmail);

        util.sendTextToElement(By.xpath("//input[@id='Company']"), "InfoTech");
        util.sendTextToElement(By.xpath("//input[@id='Password']"), "abc123");
        util.sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"), "abc123");

        util.clickOnElement(By.xpath("//input[@id='register-button']"));

        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void closeDown() throws InterruptedException {
        util.pauseBrowser(3);
        driver.quit();
    }
}
