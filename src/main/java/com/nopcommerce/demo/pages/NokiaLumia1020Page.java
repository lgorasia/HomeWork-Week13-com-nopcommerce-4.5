package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020Page extends Utility {
    By nokiaTextField = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By pricefield = By.xpath("//span[@id='price-value-20']");
    By quantiyField = By.cssSelector("#product_enteredQuantity_20");
    By addToCartField =By.cssSelector("#add-to-cart-button-20");
    By addToCartVerificationField = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeGreenBarField = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCartField = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartField= By.xpath("//button[contains(text(),'Go to cart')]");


    public String nokiaLumia(){
        return getTextFromElement(nokiaTextField);
    }
    public String price(){
        return getTextFromElement(pricefield);
    }
    public void setQuantiyField(String value){
        clearValue(quantiyField);
        sendTextToElement(quantiyField,value);
    }
    public void clikcOnAddToCart(){
        clickOnElement(addToCartField);
    }
    public String addToCartVerification(){

        return getTextFromElement(addToCartVerificationField);
    }
    public void closeGreenBar(){

        clickOnElement(closeGreenBarField);
    }
    public void shppingcartSelection(){

        mouseHoverToElement(shoppingCartField);
    }
    public void selectGoToBasket(){

        mouseHoverToElementAndClick(goToCartField);
    }

}
