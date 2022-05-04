package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentMethodPage extends Utility {
    By creditCardField = By.xpath("//input[@id='paymentmethod_1']");
    By continueButtonField = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");

    public void clickOnCreditCard(){

        clickOnElement(creditCardField);
    }public void continueButton (){
        clickOnElement(continueButtonField);
    }
}
