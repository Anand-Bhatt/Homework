package com.demo.nopcommerce;

import com.demo.nopcommerce.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStepdefs {
    @Given("^I am on Nopcommerce demo homepage$")
    public void iAmOnNopcommerceDemoHomepage() {
    }

    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String category) {

        if (category.equalsIgnoreCase("computers")) {
            new HomePage().computersLink();
           Assert.assertTrue(new HomePage().verificationComputers());
        } else if (category.equalsIgnoreCase("electronics")) {
            new HomePage().electronicsLink();
            Assert.assertTrue(new HomePage().verificationElectronics());
        } else if (category.equalsIgnoreCase("apparel")) {
            new HomePage().apparelLink();
            Assert.assertTrue(new HomePage().verificationApparel());
        } else if (category.equalsIgnoreCase("Digital Downloads")) {
            new HomePage().digitalDownloads();
            Assert.assertTrue(new HomePage().verificationDigitalDownloads());
        } else if (category.equalsIgnoreCase("books")) {
            new HomePage().booksLink();
            Assert.assertTrue(new HomePage().verificationBooks());
        } else if (category.equalsIgnoreCase("jewelry")) {
            new HomePage().jewelryLink();
            Assert.assertTrue(new HomePage().verificationJewelry());
        } else if (category.equalsIgnoreCase("gift cards")) {
            new HomePage().giftCardsLink();
            Assert.assertTrue(new HomePage().verificationGiftCards());
        }
    }


    @Then("^I should be able to see sub-category of \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeSubCategoryOf(String category)  {
    }
}

