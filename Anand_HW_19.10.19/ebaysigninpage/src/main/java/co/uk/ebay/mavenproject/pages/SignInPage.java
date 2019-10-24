package co.uk.ebay.mavenproject.pages;

import org.testng.Assert;
import co.uk.ebay.mavenproject.utility.Util;
import org.openqa.selenium.By;

public class SignInPage extends Util {
    By signInLink = By.xpath("//a[contains(text(),'Sign in')]");


    public void clickOnSignInLink() {
        clickOnElement(signInLink);
    }

}




