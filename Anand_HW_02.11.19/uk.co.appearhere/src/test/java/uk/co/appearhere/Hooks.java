package uk.co.appearhere;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.appearhere.basepage.BasePage;
import uk.co.appearhere.browserselector.BrowserSelector;
import uk.co.appearhere.loadproperty.LoadProperty;


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
