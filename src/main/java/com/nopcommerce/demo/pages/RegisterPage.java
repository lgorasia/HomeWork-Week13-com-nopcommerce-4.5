package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
By registrationTextField =By.tagName("h1");
By genderField = By.id("gender-male");
By firstNameField =By.id("FirstName");
By lastNameField = By.id("LastName");
By dayField = By.name("DateOfBirthDay");
By monthField = By.name("DateOfBirthMonth");
By yearField =By.name("DateOfBirthYear");
By emailField =By.id("Email");
By passwordField =By.id("Password");
By confirmPasswordField =By.id("ConfirmPassword");
By clickOnRegisterField =By.id("register-button");
By registrationCompletedField =By.xpath("//div[contains(text(),'Your registration completed')]");
By clickOnContinueField = By.xpath("//a[contains(text(),'Continue')]");


public String registration(){
    return getTextFromElement(registrationTextField);
}
public void gender(){
    clickOnElement(genderField);
}
public void enterFirstName(String firstName){
    sendTextToElement(firstNameField,firstName);
}
public void enterLastName(String lastName){
    sendTextToElement(lastNameField,lastName);
}
public void selectDay(String day){
    selectByVisibleTextFromDropDown(dayField,day);
}
public void selectMonth(String month){
    selectByVisibleTextFromDropDown(monthField,month);
}
public void selectYear(String year){
    selectByContainsTextFromDropDown(yearField,"1984");
}
public void enterEmail(String email){
    sendTextToElement(emailField,email);
}
public void enterPassword(String password){
    sendTextToElement(passwordField,password);
}
public void enterConfirmPassword(String confirmPassword){
    sendTextToElement(confirmPasswordField,confirmPassword);
}
public void clickOnRegistration(){
    clickOnElement(clickOnRegisterField);
}
public String registrationCompliton(){
   return getTextFromElement(registrationCompletedField);
}
public void clickOnContinue(){
    clickOnElement(clickOnContinueField);
}


}
