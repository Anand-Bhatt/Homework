package com.nocommerce.demo.pages;

import com.nocommerce.demo.basepage.BasePage;
import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By selectCurrency = By.id("customerCurrency");
    By searchStore = By.id("small-searchterms");
    By searchBtn = By.xpath("//input[@class='button-1 search-box-button']");
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By digitalDownloads = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By jewelry = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    By giftCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void selectCurrency() {
        clickOnElement(selectCurrency);
        selectByVisibleTextFromDropDown(selectCurrency, "Euro");
    }

    public void searchStore() {
        sendTextToElement(searchStore, "laptop");
    }

    public void clickOnSearchButton() {
        clickOnElement(searchBtn);
    }

    public void computersLink() {
        clickOnElement(computersLink);
    }
    public void electronicsLink(){
        clickOnElement(electronicsLink);
    }
    public void apparelLink (){
        clickOnElement(apparelLink);
    }
    public void digitalDowanloads(){
        clickOnElement(digitalDownloads);
    }
    public void booksLink(){
        clickOnElement(booksLink);
    }
    public void jewelryLink(){
        clickOnElement(jewelry);
    }
    public void giftCardsLink(){
        clickOnElement(giftCardsLink);
    }
}
