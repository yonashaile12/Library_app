package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
