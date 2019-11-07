package com.demo.nopcommerce;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on Login Link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @And("^I enter email address \"([^\"]*)\" into email field$")
    public void iEnterEmailAddressIntoEmailField(String email) {
        new LoginPage().enterEmail(email);

    }

    @And("^I enter password \"([^\"]*)\" into password field$")
    public void iEnterPasswordIntoPasswordField(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should successfully login to my account$")
    public void iShouldSuccessfullyLoginToMyAccount() {
        Assert.assertTrue(new LoginPage().loginSuccessfulVerification());
    }

    @Then("^I should not login successfully$")
    public void iShouldNotLoginSuccessfully() {
        Assert.assertTrue(new LoginPage().loginUnsuccessfulVerification());
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().welcomeText());
    }
}
