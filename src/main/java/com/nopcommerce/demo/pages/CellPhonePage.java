package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By cellPhoneTextField = By.xpath("//h1[contains(text(),'Cell phones')]");
    By gridViewField = By.xpath("//a[contains(text(),'List')]");
    By nokiaField= By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.category-page div.page-body div.products-container div.products-wrapper div.product-list div.item-grid div.item-box:nth-child(3) div.product-item div.details h2.product-title > a:nth-child(1)");


    public String cellPhoneText(){
        return getTextFromElement(cellPhoneTextField);
    }
    public void clickOnGridView(){
        clickOnElement(gridViewField);
    }
    public void clickOnNokia(){
        clickOnElement(nokiaField);
    }
}
