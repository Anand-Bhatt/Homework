package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class ItemPage extends Util {
    By buildYourOwnCom = By.xpath("//h2[@class='product-title']//a[contains(text(),'Build your own computer')]");
    By confTextBuildYourOwn = By.xpath("//h1[contains(text(),'Build your own computer')]");
   //By itemWelcomeText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By hddOption = By.id("product_attribute_3_6");
    By addToCart = By.id("add-to-cart-button-1");
    By addCartMsg = By.xpath("//div[@class='bar-notification success']");

    public void buildYourOwnComLink() {
        clickOnElement(buildYourOwnCom);
    }

    public String confTextBuildYourOwn() {
        return getTextFromElement(confTextBuildYourOwn);
    }

//    public String itemWelcomeTextMsg() {
//        return getTextFromElement(itemWelcomeText);
//    }

    public void hddOptionSelection() {
        clickOnElement(hddOption);
    }

    public void addToCartBtn() {
        clickOnElement(addToCart);
    }

    public String addCartMsgDisplay() {
        return getTextFromElement(addCartMsg);
    }
}
