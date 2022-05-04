package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutCompletedPage extends Utility {

    By thankYouField = By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-title > h1:nth-child(1)");
    By yourOrderProcessedField= By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueField= By.xpath("//button[contains(text(),'Continue')]");

    public String thankYou(){
        return getTextFromElement(thankYouField);
    }
    public String orderProcessedMessage(){
        return getTextFromElement(yourOrderProcessedField);
    }
    public void clickOnContinue(){
        clickOnElement(continueField);
    }
}
