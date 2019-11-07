package com.demo.nopcommerce;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterStepdefs {
    @Given("^I am typing https://demo\\.nopcommerce\\.com/r in my preferred browser$")
    public void iAmTypingHttpsDemoNopcommerceComRInMyPreferredBrowser() {
    }

    @When("^I click on register tab from top menu bar$")
    public void iClickOnRegisterTabFromTopMenuBar() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should be able to see registration page$")
    public void iShouldBeAbleToSeeRegistrationPage() {
        Assert.assertEquals("Register", new RegisterPage().welcomeText());
    }

    @Given("^I am on registration page$")
    public void iAmOnRegistrationPage() {
        Assert.assertEquals("Register", new RegisterPage().welcomeText());
    }

    @When("^I click on male gender$")
    public void iClickOnMaleGender() {
        new RegisterPage().genderRadioBtn();
    }

    @And("^I enter \"([^\"]*)\" in first name field$")
    public void iEnterInFirstNameField(String firstName) {
        new RegisterPage().firstNameField(firstName);

    }

    @And("^I enter \"([^\"]*)\" in last name field$")
    public void iEnterInLastNameField(String lastName) {
        new RegisterPage().lastNameField(lastName);

    }

    @And("^I select day (\\d+) from dropdown list in day field$")
    public void iSelectDayFromDropdownListInDayField(String birthDay) {
        new RegisterPage().birthDayField(birthDay);
    }



    @And("^I select year (\\d+) from dropdown list in Year field$")
    public void iSelectYearFromDropdownListInYearField(String birthYear) {
        new RegisterPage().birthYearField(birthYear);
    }

    @And("^I enter \"([^\"]*)\" in email field$")
    public void iEnterInEmailField(String email) {
        new RegisterPage().emailField(email);

    }

    @And("^I enter \"([^\"]*)\" in company name field$")
    public void iEnterInCompanyNameField(String companyName) {
        new RegisterPage().companyField(companyName);

    }

    @And("^I click on newsletter checkbox$")
    public void iClickOnNewsletterCheckbox() {
        new RegisterPage().clickOnNewsLetterbox();
    }

    @And("^I enter \"([^\"]*)\" in password field$")
    public void iEnterInPasswordField(String password) {
        new RegisterPage().passwordField(password);

    }

    @And("^I enter \"([^\"]*)\" in confirm password field$")
    public void iEnterInConfirmPasswordField(String confirmpwd) {
        new RegisterPage().confirmPwdField(confirmpwd);

    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().registerBtn();
    }

    @Then("^I should be able to register successfully$")
    public void iShouldBeAbleToRegisterSuccessfully() {
        Assert.assertEquals("Your registration completed", new RegisterPage().registerText());
    }

    @And("^I select month \"([^\"]*)\" from dropdown list in month field$")
    public void iSelectMonthFromDropdownListInMonthField(String birthMonth)  {
       new RegisterPage().birthMonthField(birthMonth);
    }
}
