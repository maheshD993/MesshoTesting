package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SareesPage extends TestBase {

    //Page Object Repository
    @FindBy(xpath = ("//h1[contains(text(),'Sarees')]"))
    WebElement sareesText;


    public SareesPage() {
        PageFactory.initElements(driver,this);
    }
    public String getElementText(){
        wait(sareesText);
        String text=sareesText.getText();
    return text;
    }

}
