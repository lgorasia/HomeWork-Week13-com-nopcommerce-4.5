package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingPage extends Utility {
    By FirstNameField = By.id("BillingNewAddress_FirstName");
    By LastNameField = By.id("BillingNewAddress_LastName");
    By emailField = By.id("BillingNewAddress_Email");
    By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressField = By.cssSelector("#BillingNewAddress_Address1");
    By postCodeField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueField = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");


    public void clickOnFirstName(String name) {
        sendTextToElement(FirstNameField, name);
    }public void clickOnLastName(String lastName){
        sendTextToElement(LastNameField,lastName);
    }public void clickOnEmail(String email){
        sendTextToElement(emailField,email);
    }public void selectCountry(){
        selectByVisibleTextFromDropDown(countryField,"United Kingdom");
    }public void selectCity(String city){
        sendTextToElement(cityField,city);
    }public void selectAddress(String address){
        sendTextToElement(addressField,address);
    }public void selectPostCode(String postcode){
        sendTextToElement(postCodeField,postcode);
    }public void selectPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberField,phoneNumber);
    }public void clickOnContinue(){
        clickOnElement(continueField);
    }

}
