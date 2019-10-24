package com.nocommerce.demo.testbase;

import com.nocommerce.demo.basepage.BasePage;
import com.nocommerce.demo.browserselector.BrowserSelector;
import com.nocommerce.demo.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BasePage {

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

@BeforeMethod
    public void setUp(){

    browserSelector.selectBrowser(browser);
}
@AfterMethod
    public void closeDown(){
    driver.quit();

}
}
