package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareesPage extends TestBase {
    @FindBy(xpath = ("//div[contains(text(),'Open Positions')]"))
    WebElement openPosition;

    public CareesPage() {
        PageFactory.initElements(driver,this);
    }

    public void clickOnOpenPositionButton(){
        clickOnElement(openPosition);
    }

}
