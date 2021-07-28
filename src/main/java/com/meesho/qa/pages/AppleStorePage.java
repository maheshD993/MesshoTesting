package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class AppleStorePage extends TestBase {
    public AppleStorePage() {
        PageFactory.initElements(driver,this);
    }
}
