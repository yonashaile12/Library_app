package com.cybertek.library.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends BasePage{

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showRecordDropDown;


}
