package com.flickr.pages;

import com.flickr.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Util {

    private Logger log = LogManager.getLogger(SignUpPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Unlimited inspiration. Unlimited passion.')]")
    WebElement _homePageLogo;

    @FindBy(xpath = "//a[@class='gn-title butt']")
    WebElement _signUpLink;

    @FindBy(xpath = "//h6[@class='f-size-4 f-weight-normal mb-3 text-center']")
    WebElement _signUpVerify;

    @FindBy(id = "sign-up-first-name")
    WebElement _firstNameField;

    @FindBy(xpath = "//input[@id='sign-up-last-name']")
    WebElement _lastNameField;

    @FindBy(xpath = "//input[@id='sign-up-age']")
    WebElement _ageField;

    @FindBy(xpath = "//input[@id='sign-up-email']")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='sign-up-password']")
    WebElement _passwordField;

    @FindBy(xpath = "//button[@class='mt-5 c-white bg-blue flickr-button flex align-center justify-center f-size-3 f-weight-bold over-y-hidden block w-100 b-rad-1 py-2 px-4']")
    WebElement _signUpButton;

    @FindBy(xpath = "//h6[@class='f-size-4 f-weight-normal mb-3 text-center']")
    WebElement _signUpButtonVerify;



    public void clickOnSignUpLink() {
        log.info("Sign Up Link");
        clickOnElement(_signUpLink);
    }

    public boolean SignUpVerification() {
        log.info("Sign Up Verification");
        return verifyThatElementIsDisplayed(_signUpVerify);
    }

    public void enterFirstName(String firstName) {
        log.info("First Name");
        sendTextToElement(_firstNameField, firstName);
    }

    public void enterLName(String lastName) {
        log.info("Last Name");
        sendTextToElement(_lastNameField, lastName);
    }
    public void enterAge(String age) {
        log.info("Age");
        sendTextToElement(_ageField, age);
    }
    public void enterEmail() {
        log.info("Enter Email");
        sendTextToElement(_emailField, "john" + generateRandomNumber() + "@gmail.com");
    }
    public void enterPassword(String password) {
        log.info("Enter password");
        sendTextToElement(_passwordField, password);
    }
    public void clickOnSignUpButton(){
        log.info("Sign Up Button");
        clickOnElement(_signUpButton);
    }
    public boolean signUpButtonVerification() {
        log.info("Sign Up Button Verification");
        return verifyThatElementIsDisplayed(_signUpButtonVerify );
    }

}

