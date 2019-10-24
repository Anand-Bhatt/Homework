package uk.co.indeed.pages;

import org.openqa.selenium.By;
import uk.co.indeed.utility.Util;

public class SignInPage extends Util {
    By signInLink = By.xpath("//a[contains(text(),'Sign in')]");


    public void clickOnSignInLink() {
        clickOnElement(signInLink);
    }

}




