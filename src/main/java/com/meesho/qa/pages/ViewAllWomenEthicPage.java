package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllWomenEthicPage extends TestBase {
    //Page Object Repository

    //View All Sub Link
    @FindBy(xpath = ("//*[contains(text(),'Alisha Refined Kurtis')]"))
    WebElement img1;



    public ViewAllWomenEthicPage() {
        PageFactory.initElements(driver,this);
    }

    public AlishRefinedkurtisPage clickOnFirstOrder(){
        mouseHoverAction(img1);
        clickOnElement(img1);
        return new AlishRefinedkurtisPage();
    }


}
