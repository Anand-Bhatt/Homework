package uk.co.clarks.testsuites;


import org.testng.annotations.Test;
import uk.co.clarks.pages.SignInPage;
import uk.co.clarks.testbase.TestBase;

public class SignInPageTest extends TestBase {
    SignInPage signInPage = new SignInPage();


    @Test
    public void homepageShouldOpenSuccessfully() {
        signInPage.clickOnSignInLink();

    }
}
