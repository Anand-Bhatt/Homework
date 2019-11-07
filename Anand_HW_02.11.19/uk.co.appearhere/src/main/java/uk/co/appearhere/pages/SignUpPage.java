package uk.co.appearhere.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.appearhere.utility.Util;

public class SignUpPage extends Util {

    private Logger log = LogManager.getLogger(SignUpPage.class.getName());
    @FindBy(xpath = "//h1[@class='Title__mainTitle___28hVx']")
    WebElement _homePageWelcomeText;
    @FindBy(xpath = "//button[@class='Bloom__root_bg button signup radius']")
    WebElement _signUpLink;
    @FindBy(xpath = "//span[contains(text(),'Sign up with Email')]")
    WebElement _withEmailLink;
    @FindBy(id = "firstName")
    WebElement _firstNameField;
    @FindBy(id = "lastName")
    WebElement _lastNameField;
    @FindBy(id = "email")
    WebElement _emailField;
    @FindBy(id = "password")
    WebElement _passwordField;
    @FindBy(xpath = "//button[@class='Bloom__root_bg Bloom__widthFull_a5 Bloom__mtr_46 Bloom__primary_bk']")
    WebElement _signUpButton;
    @FindBy(xpath = "//ul[@class='right']//a[contains(text(),'Dashboard')]")
    WebElement _verifySignUp;

    public String homePageVerification() {
        log.info("Home Page Verification");
        return getTextFromElement(_homePageWelcomeText);

    }

    public void clickOnSignUpLink() {
        log.info("Sign up link");
        clickOnElement(_signUpLink);
    }

    public void emailLinkSignUp() {
        clickOnElement(_withEmailLink);
    }

    public void enterFirstName(String firstName) {
        log.info("Enter firstname");
        sendTextToElement(_firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("Enter lastname");
        sendTextToElement(_lastNameField, lastName);
    }

    public void enterEmail() {
        log.info("Enter Email");
        sendTextToElement(_emailField, "john" + generateRandomNumber() + "@gmail.com");
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        sendTextToElement(_passwordField, password);
    }

    public void clickOnSignUpButton() {
        log.info("Sign Up button");
        clickOnElement(_signUpButton);
    }

    public boolean signUpVerification() {
        log.info("Sign Up Verification");
        verifyThatElementIsDisplayed(_verifySignUp);
        return true;
    }
}
