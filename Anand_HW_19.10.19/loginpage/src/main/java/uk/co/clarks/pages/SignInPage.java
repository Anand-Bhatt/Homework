package uk.co.clarks.pages;


import org.openqa.selenium.By;
import uk.co.clarks.utility.Util;

public class SignInPage extends Util {
    By logInLink = By.xpath("//a[@class='new-header__top-links-link new-header__top-links-link--my-account cdn-logged-out']");


    public void clickOnSignInLink() {
        clickOnElement(logInLink);
    }

}




