package co.uk.ebay.mavenproject.testsuites;

import co.uk.ebay.mavenproject.loadproperty.LoadProperty;
import co.uk.ebay.mavenproject.pages.SignInPage;
import co.uk.ebay.mavenproject.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {
    SignInPage signInPage = new SignInPage();


    @Test
    public void homepageShouldOpenSuccessfully() {
        signInPage.clickOnSignInLink();

    }
}
