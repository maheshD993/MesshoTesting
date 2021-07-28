package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayStorePage extends TestBase {

    //Variables
    //Page Object Repository

    @FindBy(xpath = ("//*[contains(text(),'Download Meesho App')]"))
    WebElement downloadAppButton;

    //Default  Constructor
    public PlayStorePage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickOnDownloadButton(){
        clickOnElement(downloadAppButton);

    }
}
