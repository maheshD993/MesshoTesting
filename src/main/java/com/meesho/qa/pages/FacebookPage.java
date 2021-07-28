package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPage extends TestBase {
    @FindBy(xpath = ("//*[@class='fb_logo img sp_yuXZKUzApHg sx_44cc47']"))
    WebElement facebookLogo;
    @FindBy(xpath = ("//*[contains(text(),'अनुप्रयोग वापरा')]"))
    WebElement waitElement;
    public FacebookPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickOnLogo(){
        clickOnElement(facebookLogo);
    }
    public void waitForElement(){
        wait(waitElement);
    }
}
