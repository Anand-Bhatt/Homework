package com.flickr;

import com.flickr.pages.SignUpPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStepdefs {
    @Given("^I am on homepage of flickr\\.com webpage$")
    public void iAmOnHomepageOfFlickrComWebpage() {

    }

    @When("^I click on Sign Up link$")
    public void iClickOnSignUpLink() {
        new SignUpPage().clickOnSignUpLink();
    }

    @And("^I enter \"([^\"]*)\" in first name field$")
    public void iEnterInFirstNameField(String firstName) {
        new SignUpPage().enterFirstName(firstName);

    }



    @And("^I enter random email in email field$")
    public void iEnterRandomEmailInEmailField() {
        new SignUpPage().enterEmail();
    }

    @And("^I enter \"([^\"]*)\" in password field$")
    public void iEnterInPasswordField(String password) {
        new SignUpPage().enterPassword(password);
    }

    @And("^I click on sign up button$")
    public void iClickOnSignUpButton() {
        new SignUpPage().clickOnSignUpButton();
    }

    @Then("^I should navigate to signup verification email send link$")
    public void iShouldNavigateToSignupVerificationEmailSendLink() {
        new SignUpPage().signUpButtonVerification();
    }

    @And("^I enter \"([^\"]*)\" as age$")
    public void iEnterAsAge(String age) {
        new SignUpPage().enterAge(age);
    }

    @And("^I enter \"([^\"]*)\"in last name field$")
    public void iEnterInLastNameField(String lastName)  {
       // Thread.sleep(2000);
        new SignUpPage().enterLName(lastName);
    }
}
