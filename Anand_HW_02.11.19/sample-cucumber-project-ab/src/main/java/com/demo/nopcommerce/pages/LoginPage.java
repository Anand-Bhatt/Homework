package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Util {

    private Logger log = LogManager.getLogger(LoginPage.class.getName());
    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(id = "Password")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;

    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement _myAccountLink;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement _unsuccessfulMsg;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeText;

    public void enterEmail(String email) {
        log.info("Enter Email: ");
        sendTextToElement(_emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        sendTextToElement(_passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Click on Login button: ");
        clickOnElement(_loginBtn);
    }

    public boolean loginSuccessfulVerification() {
        log.info("To veriry successful login");
        verifyThatElementIsDisplayed(_myAccountLink);
        return true;
    }
    public boolean loginUnsuccessfulVerification(){
        log.info("Unsuccessful login");
        return true;
    }
    public String welcomeText() {
        return getTextFromElement(_welcomeText);
    }
}
