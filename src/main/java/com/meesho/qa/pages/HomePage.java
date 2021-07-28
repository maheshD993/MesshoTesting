package com.meesho.qa.pages;
import com.meesho.qa.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    //Page Factory Object Repository
    //Header WebElement
    @FindBy(xpath = ("//input[@type='text']"))
    WebElement searchTextBox;
    @FindBy(xpath = ("//div[contains(text(),'Meesho Blog')]"))
    WebElement meeshoBlogLink;
    @FindBy(xpath = ("//div[@class='header-item-block']/div[2]"))
    WebElement becomeASupplierLink;
    @FindBy(xpath = ("//div[@class='header-button-block pointer']/img"))
    WebElement playStoreLink;
    @FindBy(xpath = ("//a[@class='header-button-block pointer']/img"))
    WebElement appleStoreLink;
    @FindBy(xpath = ("//*[@class='S_HomeBannerDos-sc-1mbynhn-0 etynol home-dos-container']/div[2]/img"))
    WebElement homepageBedSheetLink;
    @FindBy(xpath = ("//*[@class='S_HomeBannerDos-sc-1mbynhn-0 etynol home-dos-container']/div[3]/img"))
    WebElement homepageCarpetsLink;
    @FindBy(xpath = ("//*[@class='S_HomeBannerDos-sc-1mbynhn-0 etynol home-dos-container']/div[4]/img"))
    WebElement homepageKitchenwareLink;

    //Second Header
    //WomenEthic Link and Sub link of Women Ethic
    @FindBy(xpath = ("//div[@class='S_NavBarDesktop-sc-6etqgt-0 ehraEI nav-head-container']/span[1]"))
    WebElement womenEthic;
    @FindBy(xpath = ("//div[@class='nav-sub-list-cont']/div[1]/a"))
    WebElement viewAllLink;
    @FindBy(xpath = ("//div[@class='nav-sub-list-cont']/div[2]/a[1]"))
    WebElement allSareesLink;
    @FindBy(xpath = ("//div[@class='nav-sub-list-cont']/div[2]/a[2]"))
    WebElement silkSareesLink;
    @FindBy(xpath = ("//div[@class='nav-sub-list-cont']/div[2]/a[3]"))
    WebElement cottonSilkSareesLink;
    @FindBy(xpath = ("//div[@class='nav-sub-list-cont']/div[2]/a[4]"))
    WebElement cottonSareesLink;

    //Women Western Link and Sub Link of Women Western
    @FindBy(xpath = ("//div[@class='S_NavBarDesktop-sc-6etqgt-0 ehraEI nav-head-container']/span[2]"))
    WebElement womenWestern;
    @FindBy(xpath = ("//*[@class='nav-abs-cont']//div[3]//a[1]"))
    WebElement womenBra;
    @FindBy(xpath = ("//div[@class='S_NavBarDesktop-sc-6etqgt-0 ehraEI nav-head-container']/span[3]"))
    WebElement jewelleryAndAccessories;
    @FindBy(xpath = ("//div[@class='S_NavBarDesktop-sc-6etqgt-0 ehraEI nav-head-container']/span[4]"))
    WebElement menLink;
    @FindBy(xpath = ("//a[contains(text(),'Casual Shoes')]"))
    WebElement casualShoesLink;

    @FindBy(xpath = ("//div[@class='S_NavBarDesktop-sc-6etqgt-0 ehraEI nav-head-container']/span[5]"))
    WebElement beautyAndHealthLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[1]"))
    WebElement facePageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[2]"))
    WebElement eyesPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[3]"))
    WebElement lipsPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[4]"))
    WebElement nailsPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[2]//a[1]"))
    WebElement sanitizersPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[2]//a[2]"))
    WebElement oralCarePageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[2]//a[3]"))
    WebElement feminineHygienePageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[3]//a[1]"))
    WebElement deodorantsPageLink;

    @FindBy(xpath = ("//div[@class='S_NavBarDesktop-sc-6etqgt-0 ehraEI nav-head-container']/span[6]"))
    WebElement bagsAndFootwearLink;

    @FindBy(xpath = ("//div[@class='S_NavBarDesktop-sc-6etqgt-0 ehraEI nav-head-container']/span[7]"))
    WebElement homeAndLKitchenLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[1]"))
    WebElement bedsheetPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[2]"))
    WebElement doormatsPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[3]"))
    WebElement curtainsAndSheersPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[4]"))
    WebElement cushionsAndCoversPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[5]"))
    WebElement mattressPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[2]//a[1]"))
    WebElement allHomeDecorPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[2]//a[2]"))
    WebElement stickersPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[2]//a[3]"))
    WebElement clocksPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[2]//a[4]"))
    WebElement showpiecesPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[3]//a[1]"))
    WebElement kitchenStoragePageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[3]//a[2]"))
    WebElement cookwareAndBakewarePageLink;

    //Kids Link and Sub Element
    @FindBy(xpath = ("//div[@class='S_NavBarDesktop-sc-6etqgt-0 ehraEI nav-head-container']/span[8]"))
    WebElement kidsLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[1]"))
    WebElement softToysPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[2]"))
    WebElement footwearPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[3]"))
    WebElement stationeryPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[4]"))
    WebElement watchesPageLink;
    @FindBy(xpath = ("//*[@class='nav-sub-list-cont']//div[1]//a[5]"))
    WebElement bagsAndBackpacksPageLink;


    @FindBy(xpath = ("//div[@class='S_NavBarDesktop-sc-6etqgt-0 ehraEI nav-head-container']/span[9]"))
    WebElement electronicsLink;
    @FindBy(xpath = (""))
    WebElement allAppliancesLink;
    @FindBy(xpath = ("//a[contains(text(),'Grooming')]"))
    WebElement groomingLink;
    @FindBy(xpath = ("//a[contains(text(),'Home Appliances')]"))
    WebElement homeAppliancesLink;
    @FindBy(xpath = ("//span[contains(text(),'Download Meesho App')]"))
    WebElement downloadAppLink;
    //Footer WebElement (Page Object Repository)
    @FindBy(xpath = ("//*[contains(text(),'Careers')]"))
    WebElement carrersLink;
    @FindBy(xpath = ("//*[contains(text(),'Meesho Tech Blog')]"))
    WebElement meeshoTechBlog;
    @FindBy(xpath = ("//div[@class='social']//div[1]"))
    WebElement twitterPageLink;
    @FindBy(xpath = ("//div[@class='social']//div[2]"))
    WebElement linkedInPageLink;
    @FindBy(xpath = ("//div[@class='social']//div[3]"))
    WebElement youTubePageLink;
    @FindBy(xpath = ("//div[@class='social']//div[4]"))
    WebElement facebookPageLink;
    @FindBy(xpath = ("//div[@class='social']//div[5]"))
    WebElement instagramPageLink;
    @FindBy(xpath = ("//*[@class='support']//div[1]"))
    WebElement termsAndConditionPageLink;
    @FindBy(xpath = ("//*[@class='support']//div[2]"))
    WebElement privacyPolicyPageLink;

    //Initialization of Page Object
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    public void clickOnVariousLink(){
        //clickOnElement(homepageBedSheetLink);
       //clickOnElement(homepageCarpetsLink);
        clickOnElement(homepageKitchenwareLink);
    }

    public void ClickOnTextBox(String searchText){
        wait(searchTextBox);
        searchTextBox.sendKeys(searchText);
        wait(searchTextBox);
        searchTextBox.sendKeys(Keys.chord(Keys.ENTER));
    }
    public MeeshoBlogPage clickOnMeeshoBlogLink(){
        mouseHoverAction(meeshoBlogLink);
        wait(meeshoBlogLink);
        meeshoBlogLink.click();
        return new MeeshoBlogPage();
    }
    public BecomeASupplierPage clickOnBecomeASupplierLink(){
        mouseHoverAction(becomeASupplierLink);
        wait(becomeASupplierLink);
        becomeASupplierLink.click();
        return new BecomeASupplierPage();
    }
    public void clickOnPlayStoreLink(){
        mouseHoverAction(playStoreLink);
        wait(playStoreLink);
        playStoreLink.click();

    }
    public AppleStorePage clickOnAppleStoreLink(){
        mouseHoverAction(appleStoreLink);
        wait(appleStoreLink);
        appleStoreLink.click();
        return new AppleStorePage();
    }
    public void clickOnMultipleLink(){
        mouseHoverAction(womenEthic);
        wait(womenEthic);
        mouseHoverAction(womenWestern);
        wait(womenWestern);
        mouseHoverAction(jewelleryAndAccessories);
        wait(jewelleryAndAccessories);
        mouseHoverAction(menLink);
        wait(menLink);
        mouseHoverAction(beautyAndHealthLink);
        wait(beautyAndHealthLink);
        mouseHoverAction(bagsAndFootwearLink);
        wait(bagsAndFootwearLink);
        mouseHoverAction(homeAndLKitchenLink);
        wait(homeAndLKitchenLink);
        mouseHoverAction(kidsLink);
        wait(kidsLink);
        mouseHoverAction(electronicsLink);
        wait(electronicsLink);
    }

    public PlayStorePage clickOnDownloadAppLink(){
        mouseHoverAction(downloadAppLink);
        wait(downloadAppLink);
        downloadAppLink.click();
        return playStorePage;
    }

    public ViewAllWomenEthicPage clickOnWomenEthicLink(){
        mouseHoverAction(womenEthic);
        wait(womenEthic);
        clickOnElement(viewAllLink);
        return new ViewAllWomenEthicPage();
    }

    public SareesPage clickOnAllSareesLink(){
        mouseHoverAction(womenEthic);
        clickOnElement(allSareesLink);
        return new SareesPage();
    }

    public WomenBraPage clickOnBraLink(){
        mouseHoverAction(womenWestern);
        clickOnElement(womenBra);
        return  new WomenBraPage();
    }
    public CareesPage clickOnCareersLink(){
        Keys.chord(Keys.PAGE_DOWN);
        clickOnElement(carrersLink);
        return new CareesPage();
    }
    public MeeshoTechBlogPage clickOnMeeshoTechBlogLink(){
        Keys.chord(Keys.PAGE_DOWN);
        clickOnElement(meeshoTechBlog);
        return new MeeshoTechBlogPage();
    }
    public CasualShoesPage clickOnMensCasualShoes(){
        mouseHoverAction(menLink);
        clickOnElement(casualShoesLink);
        return new CasualShoesPage();
    }
    public void clickOnHomeAndKitchen(){
        mouseHoverAction(homeAndLKitchenLink);
        //clickOnElement(bedsheetPageLink);
        //clickOnElement(doormatsPageLink);
        //clickOnElement(curtainsAndSheersPageLink);
        //clickOnElement(cushionsAndCoversPageLink);
        //clickOnElement(mattressPageLink);
       // clickOnElement(allHomeDecorPageLink);
       // clickOnElement(stickersPageLink);
        //clickOnElement(clocksPageLink);
        //clickOnElement(showpiecesPageLink);
       // clickOnElement(kitchenStoragePageLink);
        clickOnElement(cookwareAndBakewarePageLink);
       // driver.navigate().back();
    }
    public void clickOnKids(){
        mouseHoverAction(kidsLink);
        clickOnElement(softToysPageLink);
        clickOnElement(footwearPageLink);
        clickOnElement(stationeryPageLink);
        clickOnElement(watchesPageLink);
        clickOnElement(bagsAndBackpacksPageLink);


    }
    public void clickOnElectronics(){
        mouseHoverAction(electronicsLink);
        //clickOnElement(allAppliancesLink);
        //clickOnElement(groomingLink);
        clickOnElement(homeAppliancesLink);
    }
    public void clickOnSocialMediaLink(){
        clickOnElement(twitterPageLink);
        //clickOnElement(instagramPageLink);
        //clickOnElement(facebookPageLink);
        //clickOnElement(linkedInPageLink);
        //clickOnElement(youTubePageLink);
    }
    public void clickOnPrivacyPolicyLink(){
        clickOnElement(termsAndConditionPageLink);
        driver.navigate().back();
       clickOnElement(privacyPolicyPageLink);
       driver.navigate().back();
    }
    public  void clickOnBeautyAndHeathLink(){
        mouseHoverAction(beautyAndHealthLink);
        //clickOnElement(facePageLink);
        //clickOnElement(eyesPageLink);
       //clickOnElement(lipsPageLink);
        //clickOnElement(nailsPageLink);
        //clickOnElement(sanitizersPageLink);
        //clickOnElement(oralCarePageLink);
        clickOnElement(feminineHygienePageLink);
        //clickOnElement(deodorantsPageLink);




    }

}
