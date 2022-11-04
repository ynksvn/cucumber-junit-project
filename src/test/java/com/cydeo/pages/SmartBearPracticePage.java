package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPracticePage {
    public SmartBearPracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
   @FindBy (id="ctl00_MainContent_username")
    public WebElement username;

    @FindBy (id="ctl00_MainContent_password")
    public WebElement password;

    @FindBy (xpath = "//a[.='Order']")
    public WebElement order;


}
