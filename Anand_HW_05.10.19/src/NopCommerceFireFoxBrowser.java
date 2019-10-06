import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerceFireFoxBrowser {
    // This programme will open the given webpage using Firefox browser
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
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
