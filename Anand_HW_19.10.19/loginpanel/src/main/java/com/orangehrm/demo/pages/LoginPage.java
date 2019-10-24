package com.orangehrm.demo.pages;

import com.orangehrm.demo.basepage.BasePage;
import com.orangehrm.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  extends Util{

    By passwordField = By.xpath("//input[@id='txtPassword']");
    By userNameField = By.id("txtUsername");
    By loginBtn = By.xpath("//input[@id='btnLogin']");
    By welcomeText = By.id("welcome");




    public void enterUserName(String username) {
        sendTextToElement(userNameField,username);

    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginBtn() {
        clickOnElement(loginBtn);
    }

    public String welcomeMsg() {
        return getTextFromElement(welcomeText);
    }
}
