package com.orangehrm.demo.testsuites;

import com.orangehrm.demo.loadproperty.LoadProperty;
import com.orangehrm.demo.pages.LoginPage;
import com.orangehrm.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginPanelTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void UserShouldLoginSuccessfully() {

        loginPage.enterUserName(loadProperty.getProperty("username"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginBtn();
    }
}
