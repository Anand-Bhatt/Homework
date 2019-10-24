package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class ComputersPage extends Util {

    By deskTopLink = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    By noteBooksLink = By.xpath("//h2[@class='title']//a[contains(text(),'Notebooks')]");
    By softWareLink = By.xpath("//h2[@class='title']//a[contains(text(),'Software')]");
    By commText = By.xpath("//h1[contains(text(),'Computers')]");


    public void deskTopMenu() {
        clickOnElement(deskTopLink);
    }

    public void noteBooksMenu() {
        clickOnElement(noteBooksLink);
    }

    public void softWareMenu() {
        clickOnElement(softWareLink);
    }

    public String verifyCommText (){
        return getTextFromElement(commText);
    }
}
