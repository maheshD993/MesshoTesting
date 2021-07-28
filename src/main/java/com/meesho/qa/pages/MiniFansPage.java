package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MiniFansPage extends TestBase {

    @FindBy(xpath = ("//div[@class='tooltip']"))
    WebElement informationDisplay;

    @FindBy(xpath = ("//*[contains(text(),'Download Meesho App')]"))
    WebElement downloadAppButton;
    public MiniFansPage(WebDriver driver) {
        this.driver=driver;
    }
    public void displayContain(){
        wait(downloadAppButton);
        mouseHoverAction(informationDisplay);
    }
}
