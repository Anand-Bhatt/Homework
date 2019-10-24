package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class ShoppingCart extends Util {
    By shoppingCartLink = By.xpath("//span[@class='cart-label']");
    By welcomeTxtShopCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }
    public String verifyWelcomeText(){
        return getTextFromElement(welcomeTxtShopCart);
    }
}
