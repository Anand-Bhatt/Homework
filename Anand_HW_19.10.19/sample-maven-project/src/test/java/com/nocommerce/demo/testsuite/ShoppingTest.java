package com.nocommerce.demo.testsuite;

import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.ShoppingCart;
import com.nocommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homepage = new HomePage();
    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void userShouldNavigateToShoppingTestSuccessfully() {
        shoppingCart.clickOnShoppingCart();
        String expectedText = "Shopping cart";
        Assert.assertEquals(shoppingCart.verifyWelcomeText(), expectedText);
    }
}
