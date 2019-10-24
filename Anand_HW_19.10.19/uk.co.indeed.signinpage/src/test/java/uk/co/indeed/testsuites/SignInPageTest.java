package uk.co.indeed.testsuites;

import org.testng.annotations.Test;
import uk.co.indeed.pages.SignInPage;
import uk.co.indeed.testbase.TestBase;

public class SignInPageTest extends TestBase {
    SignInPage signInPage = new SignInPage();


    @Test
    public void homepageShouldOpenSuccessfully() {
        signInPage.clickOnSignInLink();

    }
}
