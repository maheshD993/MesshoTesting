package com.meesho.qa.testcase;

import com.meesho.qa.base.TestBase;
import com.meesho.qa.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    public HomePageTest(){
        super();
    }
    @BeforeSuite(description = "Initialize the driver and load the Properties File")
    public void setUp(){
        initialization();
        validatingPage("Meesho Online Shopping-Lowest Prices,Great Quality.");
        homePage=new HomePage();
    }
    /*@AfterSuite(description = "Close the Driver")
    public void driverQuit(){
        driver.quit();
    }*/

   /* @Test(priority = 1)
    public void homeTest(){
        homePage.ClickOnTextBox("Jeans");
    }*/

    @Test(priority = 1,description = "All Home page Link Test")
    public void homeTest2(){
   //    homePage.clickOnMeeshoBlogLink();
     //   validatingPage("Meesho Blog - A leading expert in women's ethnic fashion");
       // homePage.clickOnBecomeASupplierLink();
       // validatingPage("Sell online on Meesho to crores of customers at 0% commission");
       // playStorePage=homePage.clickOnPlayStoreLink();
        //switchToWindow();
       // validatingPage("Meesho Online Shopping-Lowest Prices, Best Quality - Apps on Google Play");
       // appleStorePage=homePage.clickOnAppleStoreLink();
       //switchToWindow();
       // validatingPage("\u200EMeesho on the App Store");
      // homePage.clickOnMultipleLink();
        //playStorePage=homePage.clickOnDownloadAppLink();
        //switchToWindow();
        //viewAllWomenEthicPage=homePage.clickOnWomenEthicLink();
        //sareesPage=homePage.clickOnAllSareesLink();
       // womenBraPage=homePage.clickOnBraLink();
       // careesPage=homePage.clickOnCareersLink();
        //switchToWindow();
       // careesPage.clickOnOpenPositionButton();
        //meeshoTechBlogPage=homePage.clickOnMeeshoTechBlogLink();
       // switchToWindow();
        //careesPage=meeshoTechBlogPage.clickOnApplayNowLink();
        //switchToWindow();
        //validatingPage("Meesho Online Shopping-Lowest Prices,Great Quality.");

        //validatingPage("Women Ethnic Wear : Buy Latest Ethnic Wear for Women Online | Meesho");

        //casualShoesPage=homePage.clickOnMensCasualShoes();
        //homePage.clickOnHomeAndKitchen();
        //homePage.clickOnKids();
        //homePage.clickOnBeautyAndHeathLink();
        homePage.clickOnVariousLink();

    }

      /*  @Test(priority = 2)
        public void womenEthicTest(){
            alishRefinedkurtisPage=viewAllWomenEthicPage.clickOnFirstOrder();
            alishRefinedkurtisPage.clickOnDownloadButton();
            validatingPage("Alisha Refined Kurtis");
        }*/

 /*   @Test(priority = 2)
    public void sareesPageTest(){
        //Verify Page Text
        System.out.println(sareesPage.getElementText());
        aakarshaVSareesPage= clickOnProduct("Aakarsha Voguish Sarees", AakarshaVSareesPage.class);
        aakarshaVSareesPage.clickOnDownloadButton();
        validatingPage("Aakarsha Voguish Sarees");
        aakarshaVSareesPage.displayContain();
    }*/

    /*@Test(priority = 2)
    public void womenBrasTest(){
        System.out.println(womenBraPage.getElementText());
        womenNonPaddedBraPage=clickOnProduct("Women Non Padded Bandeau Bra", WomenNonPaddedBraPage.class);
        womenNonPaddedBraPage.clickOnDownloadButton();
        validatingPage("Women Non Padded Bandeau Bra");
        womenNonPaddedBraPage.displayContain();
    }*/
   /* @Test(priority = 2,description = "Casual Shoes Link Test")
    public void casualShoesTest(){
       System.out.println(casualShoesPage.getElementText());
       latestFabulousMeCasualShoesPage=clickOnProduct("Latest Fabulous Men Casual Shoes", LatestFabulousMeCasualShoesPage.class);
       latestFabulousMeCasualShoesPage.clickOnDownloadButton();
       validatingPage("Latest Fabulous Men Casual Shoes");
    }*/
   /* @Test(priority = 2,description = "Electronics Link")
    public void electronicsTest(){
        AllAppliancesPage allAppliancesPage= PageFactory.initElements(driver,AllAppliancesPage.class);
        MiniFansPage miniFansPage=PageFactory.initElements(driver,MiniFansPage.class);
        PlayStorePage playStorePage=PageFactory.initElements(driver,PlayStorePage.class);
        GroomingPage groomingPage=PageFactory.initElements(driver,GroomingPage.class);
        homePage.clickOnElectronics();
       // allAppliancesPage.clickOnElectronicsProduct();
        //miniFansPage.clickOnDownloadButton();
       // miniFansPage.displayContain();
       // miniFansPage.clickOnDownloadButton();
       // clickOnAnyProduct("Red Enzo Hair Spray");
        //groomingPage.clickOnProduct();
        HomeApliancesPage homeApliancesPage=PageFactory.initElements(driver,HomeApliancesPage.class);

            homeApliancesPage.clickOnNextButton();//click on continues not working
       // homeApliancesPage.clickOnProduct();
        //playStorePage.clickOnDownloadButton();
    }*/

 /*   @Test(priority = 2,description = "HomePage-Social Media Link")
    public void SocialMediaTest(){
        InstagramPage instagramPage=PageFactory.initElements(driver,InstagramPage.class);
        FacebookPage facebookPage=PageFactory.initElements(driver,FacebookPage.class);
        TwitterPage twitterPage=PageFactory.initElements(driver,TwitterPage.class);
        //homePage.clickOnSocialMediaLink();
        homePage.clickOnPrivacyPolicyLink();

       // facebookPage.waitForElement();
       // facebookPage.clickOnLogo();
      //  switchToWindow();
        //instagramPage.waitForElement();
       // instagramPage.clickOnFollowButton();
    }*/

}
