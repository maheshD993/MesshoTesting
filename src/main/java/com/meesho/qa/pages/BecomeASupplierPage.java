package com.meesho.qa.pages;

import com.meesho.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class BecomeASupplierPage extends TestBase {

    public BecomeASupplierPage(){
        PageFactory.initElements(driver,this);
    }
}
