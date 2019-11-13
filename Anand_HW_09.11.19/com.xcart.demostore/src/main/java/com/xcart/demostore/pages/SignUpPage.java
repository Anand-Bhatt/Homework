package com.xcart.demostore.pages;


import com.xcart.demostore.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Util {

    @FindBy(xpath = "//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]")
    WebElement _signInSignUpLink;

    @FindBy(id = "ui-id-3")
    WebElement _signInText;

    @FindBy(xpath = "//a[contains(@class,'popup-button default-popup-button create-account-link')]")
    WebElement _createAccountLink;

    @FindBy(id = "ui-id-6")
    WebElement _newAccountText;

    @FindBy(id = "login")
    WebElement _emailField;

    @FindBy(id = "password")
    WebElement _passwordField;

    @FindBy(id = "password-conf")
    WebElement _confirmPwdField;

    @FindBy(xpath = "//div[contains(@class,'button submit')]//button[contains(@class,'submit')]")
    WebElement _createButton;

    @FindBy(id = "page-title")
    WebElement _createAccountVerify;


    public void clickOnSignInSignUpLink() {
        clickOnElement(_signInSignUpLink);
    }

    public boolean signUpVerification() {
        verifyThatElementIsDisplayed(_signInText);
        return true;
    }

    public void clickOnCreateAccountLink() {
        clickOnElement(_createAccountLink);
    }

    public boolean newAccountVerification() {
        verifyThatElementIsDisplayed(_newAccountText);
        return true;
    }

    public void enterEmail() {
        sendTextToElement(_emailField, "andy" + generateRandomNumber() + "@mail.com");
    }

    public void passwordField(String password) {

        sendTextToElement(_passwordField, password);
    }

    public void confirmPwdField(String confirmpwd) {

        sendTextToElement(_confirmPwdField, confirmpwd);
    }

    public void clickOnCreate() {
        clickOnElement(_createButton);
    }

    public boolean createAccountVerification() {
        verifyThatElementIsDisplayed(_createAccountVerify);
        return true;
    }


}