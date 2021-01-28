package com.cybertek.library.pages;

import com.cybertek.library.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{

    @FindBy(id = "inputEmail")
    public WebElement signInElement;

    @FindBy(id = "inputPassword")
    public WebElement passwordElement;

    @FindBy()
    public WebElement dashBoardElement;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    public void login(String usernameValue, String passwordValue){
        signInElement.sendKeys(usernameValue);
        passwordElement.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login(){
        String usernameValue = ConfigurationReader.getProperty("librarianUsername");
        String passwordValue = ConfigurationReader.getProperty("librarianPassword");

        signInElement.sendKeys(usernameValue);
        passwordElement.sendKeys(passwordValue, Keys.ENTER);
    }


}
