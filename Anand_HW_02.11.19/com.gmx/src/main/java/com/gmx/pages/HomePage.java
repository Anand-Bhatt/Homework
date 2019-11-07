package com.gmx.pages;

import com.gmx.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    private Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//a[@class='logo-link']")
    WebElement _homePageLogo;
    @FindBy(xpath = "//a[contains(text(),'Free Email')]")
    WebElement _freeEmailLink;
    @FindBy(xpath = "//span[contains(text(),'Get your new email')]")
    WebElement _freeMailVerify;
    @FindBy(xpath = "//a[contains(text(),'Features')]")
    WebElement _featuresLink;
    @FindBy(xpath = "//h2[contains(text(),'Online Office')]")
    WebElement _featuresVerify;
    @FindBy(xpath = "//ul[@class='nav-bar-desktop']//a[contains(text(),'Apps')]")
    WebElement _appsLink;
    @FindBy(xpath = "//span[contains(text(),'GMX Free Email Apps')]")
    WebElement _appsVerify;

    public boolean homePageVerification() {
        log.info("Home Page Verification");
        return verifyThatElementIsDisplayed(_homePageLogo);
    }

    public void clickOnFreeEmailLink() {
        log.info("Free Email Link ");
        clickOnElement(_freeEmailLink);
    }
    public boolean freeEmailLinkVerification() {
        log.info("Free Email Verification");
        return verifyThatElementIsDisplayed(_freeMailVerify);
    }
    public void clickOnFeaturesLink() {
        log.info("Features Link ");
        clickOnElement(_featuresLink);
    }
    public boolean featuresLinkVerification() {
        log.info("Features Verification");
        return verifyThatElementIsDisplayed(_featuresVerify);
    }
    public void clickOnAppsLink() {
        log.info("Apps Link ");
        clickOnElement(_appsLink);
    }
    public boolean appsLinkVerification() {
        log.info("Apps Verification");
        return verifyThatElementIsDisplayed(_appsVerify);
    }
}
