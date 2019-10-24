package uk.co.indeed.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.indeed.basepage.BasePage;
import uk.co.indeed.browserselector.BrowserSelector;
import uk.co.indeed.loadproperty.LoadProperty;

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
