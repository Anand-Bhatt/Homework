package uk.org.redcross.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import uk.org.redcross.utility.Util;

public class HomePage extends Util {

    By donate = By.xpath("//span[contains(text(),'DONATE')]");
    By welcomeTxt = By.xpath("//h1[@class='small']");


    public void clickOnDonateNowLink() {
        clickOnElement(donate);

    }


    public String getWelcomeText() {

        return getTextFromElement(welcomeTxt);
    }


}

