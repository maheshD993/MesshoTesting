package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeApliancesPage extends TestBase {

    @FindBy(xpath = ("//*[contains(text(),'Elite Useful Extension Boards')]"))
    WebElement eliteBoardsProduct;
    @FindBy(xpath = ("//a[contains(text(),'Next')]"))
    WebElement nextButton;
    public HomeApliancesPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickOnProduct(){
        clickOnElement(eliteBoardsProduct);
    }
    public void clickOnNextButton(){
        clickOnElement(nextButton);
    }

}
