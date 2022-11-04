package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

@FindBy (id="searchInput")
    public WebElement search;

@FindBy (id ="searchButton")
    public WebElement searchBtn;
@FindBy (id="firstHeading")
    public WebElement mainTitle;

@FindBy (xpath = "(//div[.='Steve Jobs'])[1]")
    public WebElement imageHeader;


}
