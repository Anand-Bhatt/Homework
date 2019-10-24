package com.orangehrm.demo.testbase;

import com.orangehrm.demo.basepage.BasePage;
import com.orangehrm.demo.browserselector.BrowserSelector;
import com.orangehrm.demo.loadproperty.LoadProperty;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BasePage {

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp() {
       browserSelector.browserSelector(browser);

    }

    @AfterMethod
    public void closeDown() {
//        driver.quit();
    }
}
