package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutAsGuestField = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By welcomeToOurStoreField = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By registrationField =By.xpath("//button[contains(text(),'Register')]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
    public void checkOutsAsGuest(){
        clickOnElement(checkOutAsGuestField);
    }
    public String welcomeToOurStore(){
        return getTextFromElement(welcomeToOurStoreField);
    }
    public void clickOnRegistration(){
        clickOnElement(registrationField);
    }




}
