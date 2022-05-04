package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {
    By shoppingCartTextField =By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantityField = By.xpath("//input[@value='1']");
    By verifyTotalField = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By agreedTermsField = By.xpath("//input[@id='termsofservice']");
    By checkOutField = By.xpath("//button[@id='checkout']");
    By updateCartField = By.xpath("//button[@id='updatecart']");
    By totalForNokiaField = By.xpath("//tbody/tr[1]/td[6]");



    public String shoppingCartText(){

        return getTextFromElement(shoppingCartTextField);
    }
    public void clearQuantity(String value){
        clearValue(quantityField);
        sendTextToElement(quantityField, value);
    }
    public void updateCart(){
        clickOnElement(updateCartField);
    }
    public String verifyTotal(){
        return getTextFromElement(verifyTotalField);
    }
    public void agreedTerms(){
        clickOnElement(agreedTermsField);
    }
    public void checkOut(){

        clickOnElement(checkOutField);
    }
    public String totalForNokia(){
        return getTextFromElement(totalForNokiaField);
    }


}
