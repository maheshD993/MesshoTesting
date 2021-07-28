package com.meesho.qa.base;
import com.meesho.qa.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class TestBase {

    public static WebDriver driver;
    public Properties pop_file;
    public FileInputStream file_input;
    public static final long TIMEOUT=10;
    public static String parentWindow,childWindow;
    public HomePage homePage;
    public MeeshoBlogPage meeshoBlogPage;
    public BecomeASupplierPage becomeASupplierPage;
    public PlayStorePage playStorePage;
    public AppleStorePage appleStorePage;
    public ViewAllWomenEthicPage viewAllWomenEthicPage;
    public AlishRefinedkurtisPage alishRefinedkurtisPage;
    public SareesPage sareesPage;
    public ChitrarekhaPage chitrarekhaPage;
    public MyraPetitePage myraPetitePage;
    public WomenBraPage womenBraPage;
    public WomenNonPaddedBraPage womenNonPaddedBraPage;
    public AakarshaVSareesPage aakarshaVSareesPage;
    public CareesPage careesPage;
    public MeeshoTechBlogPage meeshoTechBlogPage;
    public CasualShoesPage casualShoesPage;
    public LatestFabulousMeCasualShoesPage latestFabulousMeCasualShoesPage;


    //Constructor for loading Properties File
    public TestBase() {
        try {
            pop_file = new Properties();
            file_input = new FileInputStream("C:\\Users\\Mahesh\\IdeaProjects\\MeeshoShoppingWebsite\\src\\main\\resources\\configuration.properties");
            pop_file.load(file_input);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        } catch (IOException ioException) {
            System.out.println(ioException);
        }
    }

        public void initialization(){
            if (pop_file.getProperty("Browser").equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "E:\\selenium online course\\software\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (pop_file.getProperty("Browser").equalsIgnoreCase("FireFox")) {
                System.setProperty("webdriver.gecko.driver", "E:\\selenium online course\\software\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else {
                //set System Property
                driver = new InternetExplorerDriver();
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(pop_file.getProperty("URl"));
        }
        // Use Expected Condition for Wait
        public void wait(WebElement webElement){
            WebDriverWait wait=new WebDriverWait(driver,TIMEOUT);
            wait.until(ExpectedConditions.visibilityOf(webElement));
            wait.until(ExpectedConditions.elementToBeClickable(webElement));

        }
        //Use for validating page
    public void validatingPage(String currentPageTitle){
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),currentPageTitle);

        System.out.println("We Present In="+currentPageTitle);

    }

    //Use Expected Condition for Switching Window
    public void switchToWindow(){
        parentWindow=driver.getWindowHandle();
        Set<String> multipleWindows=driver.getWindowHandles();
        Iterator<String> iterate=multipleWindows.iterator();
        while(iterate.hasNext()){
            childWindow=iterate.next();
            if(!parentWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
            }
        }
    }
    //Use Expected Condition for Switching Frame
    public void switchToFrame(String frameName){
        driver.switchTo().frame(frameName);
    }

    //Use Expected Condition for Mouse Hover Action
    public void mouseHoverAction(WebElement webElement){
        Actions act=new Actions(driver);
        act.moveToElement(webElement).perform();
    }

    public void clickOnElement(WebElement webElement){
        wait(webElement);
        webElement.click();

    }
    //Generic Method For Sarees Click
    public <T> T clickOnProduct (String product_name, Class<T> expectedPage){
        WebElement expected_Product= driver.findElement(By.xpath("//*[contains(text(),'"+product_name+"')]"));
        clickOnElement(expected_Product);
        return PageFactory.initElements(driver,expectedPage);
    }
    public void clickOnAnyProduct(String product_name){
        WebElement expected_Product= driver.findElement(By.xpath("//*[contains(text(),'"+product_name+"')]"));
        clickOnElement(expected_Product);
    }



    }






