package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Util {
    private Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(linkText = "Register")
    WebElement _welcomeText;

    @FindBy(id = "gender-male")
    WebElement _genderRadioBtn;

    @FindBy(id = "FirstName")
    WebElement _firstNameField;

    @FindBy(id = "LastName")
    WebElement _lastNameField;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement _birthDayField;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement _birthMonthField;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement _birthYearField;

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement _companyField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement _confirmPwdField;

    @FindBy(xpath = "//input[@id='register-button']")
    WebElement _registerBtn;

    @FindBy(xpath = "//div[@class='result']")
    WebElement _regiText;

    @FindBy(id = "Newsletter")
    WebElement _newsletter;



    public String welcomeText() {

        log.info("Registration page Welcome message displayed");
        return getTextFromElement(_welcomeText);
    }

    public void genderRadioBtn() {
        log.info("Gender button selected");
        clickOnElement(_genderRadioBtn);
    }

    public void firstNameField(String firstName) {
        log.info("First Name");
        sendTextToElement(_firstNameField, firstName);

    }

    public void lastNameField(String lastName) {
        log.info("Last Name");
        sendTextToElement(_lastNameField, lastName);
    }

    public void birthDayField(String birthDay) {
        log.info("Date of Birth");
        selectByVisibleTextFromDropDown(_birthDayField, "4");
    }

    public void birthMonthField(String birthMonth) {
        log.info("Month of Birth");
        selectByVisibleTextFromDropDown(_birthMonthField, "June");
    }

    public void birthYearField(String birthYear) {
        log.info("Year of birth");
        selectByVisibleTextFromDropDown(_birthYearField, "1978");
    }

    public void emailField(String email) {
        log.info("Email address");
        sendTextToElement(_emailField, email);
    }

    public void companyField(String companyName) {
        log.info("Company Name");
        sendTextToElement(_companyField, companyName);
    }

    public void passwordField(String password) {
        log.info("Password");
        sendTextToElement(_passwordField, password);
    }

    public void confirmPwdField(String confirmpwd) {
        log.info("Confirm Password");

        sendTextToElement(_confirmPwdField, confirmpwd);
    }

    public void registerBtn() {
        log.info("Registration button");
        clickOnElement(_registerBtn);
    }

    public String registerText() {
        log.info("Registration text verification");

        return getTextFromElement(_regiText);
    }

    public void clickOnNewsLetterbox() {
        log.info("News letter checkbox optional");
        clickOnElement(_newsletter);
    }
}
