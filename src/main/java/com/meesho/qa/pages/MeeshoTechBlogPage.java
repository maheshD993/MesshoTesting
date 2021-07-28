package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeeshoTechBlogPage extends TestBase {

    @FindBy(xpath = ("//a[contains(text(),'Interested? Apply Now')]"))
    WebElement applyNow;
    public MeeshoTechBlogPage() {
        PageFactory.initElements(driver,this);
    }
    public CareesPage clickOnApplayNowLink(){
        Keys.chord(Keys.PAGE_DOWN);
        clickOnElement(applyNow);
        return careesPage;
    }
}
