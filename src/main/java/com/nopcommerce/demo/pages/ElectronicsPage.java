package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electonicsField =By.tagName("h1");

    public String electronics(){
        return getTextFromElement(electonicsField);
    }

}

