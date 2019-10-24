package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends Util {

    By welcomeText = By.linkText("Register");
    By genderRadiobtn = By.id("gender-male");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By birthDayField = By.xpath("//select[@name='DateOfBirthDay']");
    By birthMonthField = By.xpath("//select[@name='DateOfBirthMonth']");
    By birthYearField = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyField = By.xpath("//input[@id='Company']");
    By passwordField = By.xpath("//input[@id='Password']");
    By confirmPwdField = By.xpath("//input[@id='ConfirmPassword']");
    By registerBtn = By.xpath("//input[@id='register-button']");
    By regiText = By.xpath("//div[@class='result']");


    public String welcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void genderRadioBtn() {
        clickOnElement(genderRadiobtn);
    }

    public void firstNameField(String firstName) {
        sendTextToElement(firstNameField, firstName);

    }

    public void lastNameField(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void birthDayField(String birthDay) {
        sendTextToElement(birthDayField, birthDay);
    }

    public void birthMonthField(String birthMonth) {
        sendTextToElement(birthMonthField, birthMonth);
    }

    public void birthYearField(String birthYear) {
        sendTextToElement(birthYearField, birthYear);
    }

    public void emailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void companyField(String companyName) {
        sendTextToElement(companyField, companyName);
    }

    public void passwordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void confirmPwdField(String confirmpwd) {
        sendTextToElement(confirmPwdField, confirmpwd);
    }

    public void registerBtn() {
        clickOnElement(registerBtn);
    }

    public String registerText() {
        return getTextFromElement(regiText);
    }
}
