package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllAppliancesPage extends TestBase {

    @FindBy(xpath = ("//h4[contains(text(),'Mini Fans')]"))
    WebElement miniFansLink;

    public AllAppliancesPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickOnElectronicsProduct(){

        clickOnElement(miniFansLink);
    }
}
