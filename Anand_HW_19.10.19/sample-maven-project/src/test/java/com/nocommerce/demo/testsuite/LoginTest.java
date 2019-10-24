package com.nocommerce.demo.testsuite;

import com.nocommerce.demo.loadproperty.LoadProperty;
import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.LoginPage;
import com.nocommerce.demo.testbase.TestBase;
import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    LoadProperty loadProperty = new LoadProperty();
    @Test
    public void ShouldLoginSuccessfully () {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(loginPage.welcomeText(), expectedText);
    }

    @Test
    public void userShouldLoginSuccessfully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginButton();
    }

    }
