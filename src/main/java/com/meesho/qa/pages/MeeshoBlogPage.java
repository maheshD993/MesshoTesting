package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class MeeshoBlogPage extends TestBase {
    public MeeshoBlogPage() {
        PageFactory.initElements(driver,this);
    }
}
