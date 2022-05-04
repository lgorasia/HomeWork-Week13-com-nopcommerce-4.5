package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {
    By atoZPositionField = By.xpath("//select[@id='products-orderby']");
    By addInCartField = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");


    public void arrangeAtoZPosition(){
        selectByVisibleTextFromDropDown(atoZPositionField,"Name: A to Z");
    }
    public void clickAddInCart(){
        clickOnElement(addInCartField);
    }

}
