package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenBraPage extends TestBase {
    @FindBy(xpath = ("//h1[contains(text(),'Bras')]"))
    WebElement brasText;
    public WomenBraPage() {
        PageFactory.initElements(driver, this);
    }
    public String getElementText(){
        wait(brasText);
        String text=brasText.getText();
        return text;
    }
}
