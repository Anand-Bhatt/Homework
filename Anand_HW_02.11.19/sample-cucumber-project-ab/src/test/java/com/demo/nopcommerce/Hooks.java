package com.demo.nopcommerce;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.loadproperty.LoadProperty;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BasePage {

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void setUp() {
        browserSelector.selectBrowser(browser);
    }

    @After
    public void closeDown() {
        driver.quit();
    }
}
