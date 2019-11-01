package uk.org.redcross.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.org.redcross.basepage.BasePage;
import uk.org.redcross.browserselector.BrowserSelector;
import uk.org.redcross.loadproperty.LoadProperty;

public class TestBase extends BasePage {
    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp() {
        browserSelector.selectBrowser(browser);

    }

    @AfterMethod

    public void closeDown() {
        driver.quit();
    }
}
