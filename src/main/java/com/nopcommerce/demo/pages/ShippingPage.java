package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {
    By deliveryMethodSelection = By.xpath("//input[@id='shippingoption_1']");
    By contunueButtonField = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By deliveryMethodForNokia= By.id("shippingoption_2");

    public void deliveryMethod(){
        clickOnElement(deliveryMethodSelection);
    }
    public void clickContinue(){
        clickOnElement(contunueButtonField);
    }
    public void clickOnNokiaDeliveryOption(){
        clickOnElement(deliveryMethodForNokia);
    }


}
