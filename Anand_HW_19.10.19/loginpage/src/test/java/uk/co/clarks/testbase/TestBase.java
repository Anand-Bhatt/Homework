package uk.co.clarks.testbase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.clarks.basepage.BasePage;
import uk.co.clarks.browserselector.BrowserSelector;
import uk.co.clarks.loadproperty.LoadProperty;

import static uk.co.clarks.basepage.BasePage.driver;

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
