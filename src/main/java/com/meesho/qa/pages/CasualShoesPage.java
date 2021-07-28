package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualShoesPage extends TestBase {
    @FindBy(xpath = ("//h1[contains(text(),'Men Casual Shoes')]"))
    WebElement menCasualShoesText;
    public CasualShoesPage() {
        PageFactory.initElements(driver,this);
    }

    public String getElementText(){
        wait(menCasualShoesText);
        String text=menCasualShoesText.getText();
        return text;
    }
}
