package com.xcart.demostore.testsuite;


import com.xcart.demostore.loadproperty.LoadProperty;
import com.xcart.demostore.pages.SalePage;
import com.xcart.demostore.pages.SignUpPage;
import com.xcart.demostore.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllTest extends TestBase {


    @Test
    public void SignUpSuccessfully() {
        LoadProperty loadProperty = new LoadProperty();
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.clickOnSignInSignUpLink();
        signUpPage.signUpVerification();
        signUpPage.clickOnCreateAccountLink();
        signUpPage.newAccountVerification();
        signUpPage.enterEmail();
        signUpPage.passwordField(loadProperty.getProperty("password"));
        signUpPage.confirmPwdField(loadProperty.getProperty("confirmpwd"));
        signUpPage.clickOnCreate();
        signUpPage.createAccountVerification();

        SalePage salePage = new SalePage();
        salePage.hotDealsTab();
        salePage.saleTabVerification();
        salePage.clickOnBootsLink();

        String bootsText = "Lace-Up Boots in Light Brown";
        Assert.assertEquals(salePage.bootsLinkText(), bootsText);
    }


}
