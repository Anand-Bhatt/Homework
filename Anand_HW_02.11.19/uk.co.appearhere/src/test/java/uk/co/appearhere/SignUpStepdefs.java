package uk.co.appearhere;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.appearhere.pages.SignUpPage;

public class SignUpStepdefs {
    @Given("^I am on homepage of Appearhere\\.co\\.uk webpage$")
    public void iAmOnHomepageOfAppearhereCoUkWebpage() {
        Assert.assertEquals("FIND SPACE FOR YOUR IDEA", new SignUpPage().homePageVerification());
    }

    @When("^I clik on Sign Up link$")
    public void iClikOnSignUpLink() {
        new SignUpPage().clickOnSignUpLink();

    }

    @And("^I click on sign up with email field$")
    public void iClickOnSignUpWithEmailField() {
        new SignUpPage().emailLinkSignUp();
    }

    @And("^I enter \"([^\"]*)\" in First Name field$")
    public void iEnterInFirstNameField(String firstName) {
        new SignUpPage().enterFirstName(firstName);

    }

    @And("^I enter \"([^\"]*)\" in Last Name field$")
    public void iEnterInLastNameField(String lastName) {
        new SignUpPage().enterLastName(lastName);

    }

//    @And("^I enter \"([^\"]*)\" in email field$")
//    public void iEnterInEmailField(String email) {
//        new SignUpPage().enterEmail(email);
//
//    }

    @And("^I enter \"([^\"]*)\" in password field$")
    public void iEnterInPasswordField(String password) {
        new SignUpPage().enterPassword(password);
    }

    @And("^I click on sign up button$")
    public void iClickOnSignUpButton() {
        new SignUpPage().clickOnSignUpButton();
    }

    @Then("^I should sign up successfully and I should dashboard tab appears$")
    public void iShouldSignUpSuccessfullyAndIShouldDashboardTabAppears() {
        Assert.assertTrue(new SignUpPage().signUpVerification());
    }

    @And("^I enter random email in email field$")
    public void iEnterRandomEmailInEmailField() {
        new SignUpPage().enterEmail();
    }
}
