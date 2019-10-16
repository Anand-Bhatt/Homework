package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {
    WebDriver driver;

    public Utility(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    // Method to send text/keys to element
    public void sendTextToElement(By by, String str) {
        driver.findElement(by).sendKeys(str);
    }

    // Method to select from dropdown menu by using text
    public void dropDownMenuByText(By by, String str) {
        WebElement element = driver.findElement(by);
        Select sel = new Select(element);
        sel.selectByVisibleText(str);
    }
    // Method to select from dropdown menu by value
    public void dropDownMenuByValue(By by, String str) {
        WebElement element = driver.findElement(by);
        Select sel = new Select(element);
        sel.selectByValue(str);
    }

    // Method to select from dropdown menu by index
    public void dropDownMenuByIndex(By by, int index) {
        WebElement element = driver.findElement(by);
        Select sel = new Select(element);
        sel.selectByIndex(index);
    }
    // Method to pause browser by seconds
    public void pauseBrowser(int sec) throws InterruptedException {
        Thread.sleep(sec*1000);
    }
    // Method to check if element is displayed
    public Boolean isElementDisplayed(By by) {
        if (driver.findElement(by).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}



