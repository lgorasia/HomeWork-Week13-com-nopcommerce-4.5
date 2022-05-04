package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentInfoPage extends Utility {
    By cardTypeField =By.xpath("//select[@id='CreditCardType']");
    By cardHolderNameField =By.xpath("//input[@id='CardholderName']");
    By cardNumberField= By.xpath("//input[@id='CardNumber']");
    By expiryMonthField = By.xpath("//select[@id='ExpireMonth']");
    By expiryYearField = By.xpath("//select[@id='ExpireYear']");
    By cardCodeField= By.xpath("//input[@id='CardCode']");
    By continueField= By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");


    public void clickOnCardType(String type){
        selectByVisibleTextFromDropDown(cardTypeField, type);
    }
    public void clickOnName(String name){
        sendTextToElement(cardHolderNameField,name);
    }
    public void clickOncardNumber(String cardNumber){
        sendTextToElement(cardNumberField,cardNumber);
    }
    public void expiryMonth(String month){
        selectByVisibleTextFromDropDown(expiryMonthField,month);
    }
    public void expiryYear(String year){
        selectByVisibleTextFromDropDown(expiryYearField,year);
    }
    public void clickOnCardCode(String code){
        sendTextToElement(cardCodeField,code);
    }
    public void continueButton(){
        clickOnElement(continueField);
    }

}
