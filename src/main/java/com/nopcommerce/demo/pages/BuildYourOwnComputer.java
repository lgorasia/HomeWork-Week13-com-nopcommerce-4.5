package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By buildYourOwnComputerField = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorSelection = By.xpath("//select[@id='product_attribute_1']");
    By ramSelection = By.xpath("//select[@id='product_attribute_2']");
    By hddRadioSelection = By.cssSelector("#product_attribute_3_7");
    By osRadioSelection = By.cssSelector("#product_attribute_4_9");
    By softwareSelection =By.id("product_attribute_5_12");
    By verifyPriceField = By.id("price-value-1");
    By addToCartField = By.id("add-to-cart-button-1");
    By addToCartVerificationField = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeGreenBarField = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCartField = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartField= By.xpath("//button[contains(text(),'Go to cart')]");


    public String buildYourComputerText(){
        return getTextFromElement(buildYourOwnComputerField);
    }
    public void selectProcessorFromDropdown(){
        selectByVisibleTextFromDropDown(processorSelection,"2.2 GHz Intel Pentium Dual-Core E2200");
    }
    public void selecRamFromFromDropdown(){
        selectByVisibleTextFromDropDown(ramSelection,"8GB [+$60.00]");
    }
    public void clickOnHddRadio(){
        clickOnElement(hddRadioSelection);
    }
    public void osRadio(){
        clickOnElement(osRadioSelection);
    }
    public void clickSoftware(){
        clickOnElement(softwareSelection);
    }
    public String varifyPrice(){
        return getTextFromElement(verifyPriceField);
    }
    public void addtocart(){
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
