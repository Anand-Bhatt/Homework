import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RunTestOnChromeBrowser {
    public static void main(String[] args) {
        //String baseUrl = "https://www.google.co.uk";
        String baseUrl = "https://learn.letskodeit.com/p/practice";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // find elements for login link
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();
        // find element for email address field
        WebElement emailField = driver.findElement(By.id("user_email"));
        emailField.sendKeys("abc@gmail.com");
        //find element for password field
        WebElement pwdField = driver.findElement(By.id("user_password"));
        pwdField.sendKeys("xyz123");
        //find element for login button
        WebElement loginbtn = driver.findElement(By.name("commit"));
        loginbtn.submit();

        // driver.quit();

    }
}
