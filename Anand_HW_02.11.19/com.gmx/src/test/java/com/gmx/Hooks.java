package com.gmx;

import com.gmx.basepage.BasePage;
import com.gmx.browserselector.BrowserSelector;
import com.gmx.loadproperty.LoadProperty;
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
