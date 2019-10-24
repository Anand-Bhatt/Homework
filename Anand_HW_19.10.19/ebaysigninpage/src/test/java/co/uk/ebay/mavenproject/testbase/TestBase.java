package co.uk.ebay.mavenproject.testbase;

import co.uk.ebay.mavenproject.basepage.BasePage;
import co.uk.ebay.mavenproject.browserselector.BrowserSelector;
import co.uk.ebay.mavenproject.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    String browser = new LoadProperty().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void closeDown() {
        driver.quit();

    }
}
