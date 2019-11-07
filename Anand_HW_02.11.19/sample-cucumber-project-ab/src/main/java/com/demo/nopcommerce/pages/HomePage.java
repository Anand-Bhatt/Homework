package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    private Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(linkText = "Register")
    WebElement _registerLink;

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(id = "customerCurrency")
    WebElement _selectCurrency;

    @FindBy(id = "small-searchterms")
    WebElement _searchStore;

    @FindBy(xpath = "//input[@class='button-1 search-box-button']")
    WebElement _searchBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement _computersLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement _electronicsLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement _apparelLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement _digitalDownloads;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement _booksLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement _jewelry;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement _giftCardsLink;
// Elements to verify

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement _vrComputers;
    @FindBy(xpath = "//h1[contains(text(),'Electronics')]")
    WebElement _vrElectronics;
    @FindBy(xpath = "//h1[contains(text(),'Apparel')]")
    WebElement _vrApparel;
    @FindBy(xpath = "//h1[contains(text(),'Digital downloads')]")
    WebElement _vrDigitalDownloads;
    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement _vrBooks;
    @FindBy (xpath = "//h1[contains(text(),'Jewelry')]")
    WebElement _vrJewelry;
    @FindBy(xpath = "//h1[contains(text(),'Gift Cards')]")
    WebElement _vrGiftCards;

    public void clickOnRegisterLink() {
        clickOnElement(_registerLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(_loginLink);
    }

    public void selectCurrency() {
        clickOnElement(_selectCurrency);
        selectByVisibleTextFromDropDown(_selectCurrency, "Euro");
    }

    public void searchStore() {
        sendTextToElement(_searchStore, "laptop");
    }

    public void clickOnSearchButton() {
        clickOnElement(_searchBtn);
    }

    public void computersLink() {
        log.info("Computers link");
        clickOnElement(_computersLink);
    }

    public void electronicsLink() {
        log.info("Electronics link");
        clickOnElement(_electronicsLink);
    }

    public void apparelLink() {
        log.info("Apparel link");
        clickOnElement(_apparelLink);
    }

    public void digitalDownloads() {
        log.info("Digital Downloads link");
        clickOnElement(_digitalDownloads);
    }

    public void booksLink() {
        log.info("Books link");
        clickOnElement(_booksLink);
    }

    public void jewelryLink() {
        log.info("Jewelry link");
        clickOnElement(_jewelry);
    }

    public void giftCardsLink() {
        log.info("Gift Cards link");
        clickOnElement(_giftCardsLink);
    }

    // Methods for verification
    public boolean verificationComputers(){
        log.info("Verification Computers");
        verifyThatElementIsDisplayed(_vrComputers);
        return true;
    }
    public boolean verificationElectronics(){
        log.info("Verification Electronics");
        verifyThatElementIsDisplayed(_vrElectronics);
        return true;
    }
    public boolean verificationApparel(){
        log.info("Verification Apparel");
        verifyThatElementIsDisplayed(_vrApparel);
        return true;
    }
    public boolean verificationDigitalDownloads(){
        log.info("Verification Digital Downloads");
        verifyThatElementIsDisplayed(_vrDigitalDownloads);
        return true;
    }
    public boolean verificationBooks(){
        log.info("Verification Books");
        verifyThatElementIsDisplayed(_vrBooks);
        return true;
    }
    public boolean verificationJewelry(){
        log.info("Verification Jewelry");
        verifyThatElementIsDisplayed(_vrJewelry);
        return true;
    }
    public boolean verificationGiftCards(){
        log.info("Verification GiftCards");
        verifyThatElementIsDisplayed(_vrGiftCards);
        return true;
    }
}
