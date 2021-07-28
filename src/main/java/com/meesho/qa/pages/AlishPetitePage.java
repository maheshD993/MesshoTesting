package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class AlishPetitePage extends TestBase {
    public AlishPetitePage() {
        PageFactory.initElements(driver,this);
    }
}
