package com.nocommerce.demo.testsuite;

import com.nocommerce.demo.loadproperty.LoadProperty;
import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.ItemPage;
import com.nocommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemTest extends TestBase {

    ItemPage itempage = new ItemPage();

    @Test
    public void userShouldNegivateToDesktopPageSuccessfully() {

        itempage.buildYourOwnComLink();

        String deskTopExpected = "Build your own computer";
        Assert.assertEquals(itempage.confTextBuildYourOwn(), deskTopExpected);

        itempage.hddOptionSelection();
        itempage.addToCartBtn();

        String addToCartExpected = "The product has been added to your shopping cart";
        Assert.assertEquals(itempage.addCartMsgDisplay(), addToCartExpected);
    }
}
