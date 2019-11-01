package uk.org.redcross.testsuites;


import org.testng.Assert;
import org.testng.annotations.Test;
import uk.org.redcross.pages.HomePage;
import uk.org.redcross.testbase.TestBase;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToHomePageSuccessfully() {
        homePage.clickOnDonateNowLink();
        String expectedTxt = "DONATE TO THE RED CROSS";
        Assert.assertEquals(homePage.getWelcomeText(), expectedTxt);
    }

//    @Test
//    public void verifyUrl() {
//        String currentURL = driver.getCurrentUrl();
//        String actualUrl = "https://www.redcross.org.uk/get-involved/donate";
//        Assert.assertEquals(currentURL, actualUrl);
//    }

//        String expectedTxt = "DONATE TO THE RED CROSS";
//        Assert.assertEquals(homePage.getWelcomeText(), expectedTxt);
}


