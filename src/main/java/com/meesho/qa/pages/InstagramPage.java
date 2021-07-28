package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstagramPage extends TestBase {
    @FindBy(xpath = ("//button[@class='sqdOP L3NKy y3zKF']"))
    WebElement followButton;
    @FindBy(xpath = ("//button[contains(text(),'Log In')]"))
    WebElement loginInInstagram;
    public InstagramPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickOnFollowButton(){
        clickOnElement(followButton);
    }
    public void waitForElement(){
        wait(loginInInstagram);
    }
}
