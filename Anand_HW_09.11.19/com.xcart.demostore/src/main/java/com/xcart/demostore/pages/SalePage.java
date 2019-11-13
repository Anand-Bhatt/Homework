package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalePage extends Util {
    @FindBy(xpath = "//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][contains(text(),'Hot deals')]")
    WebElement _hotDealsLink;

    @FindBy(xpath = "//li[@class='leaf has-sub']//span[contains(text(),'Sale')]")
    WebElement _saleLink;

    @FindBy(id = "page-title")
    WebElement _saleTabVerify;

    @FindBy(xpath = "//a[contains(text(),'Lace-Up Boots in Light Brown')]")
    WebElement _bootsLink;

    @FindBy (xpath = "//h1[@class='fn title']")
    WebElement _bootsWelcomeText;

    public void hotDealsTab() {
        clickOnElement(_hotDealsLink);
        clickOnElement(_saleLink);

    }


    public boolean saleTabVerification() {
        verifyThatElementIsDisplayed(_saleTabVerify);
        return true;
    }

    public void clickOnBootsLink(){
        clickOnElement(_bootsLink);
    }
    public String bootsLinkText() {

        return getTextFromElement(_bootsWelcomeText);
    }

}
