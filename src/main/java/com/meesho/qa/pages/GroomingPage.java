package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GroomingPage extends TestBase {
    @FindBy(xpath = ("//*[contains(text(),'Amazing Travel And Grooming Kit')]"))
    WebElement hairSprayProduct;
    public GroomingPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickOnProduct(){
       clickOnElement(hairSprayProduct);
    }
}
