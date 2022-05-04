package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By computerField = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By electonicsField = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By cellPhoneField = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");


    public void clickOnComputer() {
        clickOnElement(computerField);
    }
    public void clickOnElectronicsField(){
        mouseHoverToElement(electonicsField);
    }
    public void clickOnCellPhoneField(){
        mouseHoverToElementAndClick(cellPhoneField);
    }

}







