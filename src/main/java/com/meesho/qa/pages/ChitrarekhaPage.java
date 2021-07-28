package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChitrarekhaPage extends TestBase {
    @FindBy(xpath = ("//*[contains(text(),'Download Meesho App')]"))
    WebElement downloadAppButton;

    public ChitrarekhaPage() {
        PageFactory.initElements(driver,this);
    }
    public void clickOnDownloadButton(){
        wait(downloadAppButton);
    }
}
