package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
   @FindBy (name="username")
    public WebElement inputUserName;

    @FindBy (name="password")
    public WebElement inputUserPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    public void login(String username, String password){
        inputUserName.sendKeys(username);
        inputUserPassword.sendKeys(password);
        loginBtn.click();
    }

}
