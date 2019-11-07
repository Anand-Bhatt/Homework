package com.gmx;

import com.gmx.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStepdefs {
    @Given("^I am on homepage of gmx\\.com webpage$")
    public void iAmOnHomepageOfGmxComWebpage() {
        new HomePage().homePageVerification();
    }

    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String category) {
        if (category.equalsIgnoreCase("free email")) {
            new HomePage().clickOnFreeEmailLink();
            Assert.assertTrue(new HomePage().freeEmailLinkVerification());
        } else if (category.equalsIgnoreCase("features")) {
            new HomePage().clickOnFeaturesLink();
            Assert.assertTrue(new HomePage().featuresLinkVerification());
        } else if (category.equalsIgnoreCase("apps")) {
            new HomePage().clickOnAppsLink();
            Assert.assertTrue(new HomePage().appsLinkVerification());
        }
    }

    @Then("^I should be able to see sub-category of \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeSubCategoryOf(String category) {

    }
}
