import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerceChromeBrowser {
    // This programme will open the given webpage using Chrome browser
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // find elements for login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // find element for email address field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("ahbhatt04@gmail.com");

        //find element for password field
        WebElement pwdField = driver.findElement(By.id("Password"));
        pwdField.sendKeys("xyz123");

        //find element for login button
        WebElement loginbtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginbtn.click();
    }
}
