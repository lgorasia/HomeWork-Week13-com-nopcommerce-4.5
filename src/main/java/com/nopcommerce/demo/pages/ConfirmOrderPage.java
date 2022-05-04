package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {
    By paymentField= By.xpath("//span[contains(text(),'Credit Card')]");
    By deliveryMethodField = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By totalField = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By confirmField= By.xpath("//button[contains(text(),'Confirm')]");




    public String payment(){
        return  getTextFromElement(paymentField);
    }
    public String deliveryMethod(){
        return getTextFromElement(deliveryMethodField);
    }
    public String total(){
        return getTextFromElement(totalField);
    }
    public void confirmbutton(){
        clickOnElement(confirmField);
    }

}
