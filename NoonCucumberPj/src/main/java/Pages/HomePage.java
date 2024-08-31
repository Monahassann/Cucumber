package Pages;

import Utitlities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver ;
    WebDriverWait wait;


    By language = By.xpath("//div[@class='sc-5a88e932-2 inkyqe']//div[@data-qa='lnk_languageSelector']");
    By login = By.xpath("//button[@data-qa='btn_header_signInOrUp']");
    By wishList = By.xpath("//a[@class='wishlistLink']");
    By cart = By.xpath("//a[@class='cartLink']");
    By searchBar = By.xpath("//input[@id='searchBar']");

    By electronicsCategory = By.xpath("//li//a[@href= '/egypt-en/electronics/']");

    By mobCategory = By.xpath("//li//a[@href= '/egypt-en/electronics/']//following::a[1]");

    By menCategory = By.xpath("//li//a[@href= '/egypt-en/electronics/']//following::a[2]");

    By swipper = By.xpath("//div[@class= 'jsx-undefined swiper-button-next']");
    public HomePage(WebDriver driver){this.driver = driver;};

    public void changeYourLanguage() {
        BrowserActions.clickOnButton(language,driver);
    }
    public void clickLogin () {BrowserActions.clickOnButton(login,driver);};
    public void clickWishList () {BrowserActions.clickOnButton(wishList,driver);};

    public void clickCart () {BrowserActions.clickOnButton(cart,driver);};
    public void enterSearch (String text){BrowserActions.sendKeys(searchBar,driver,text);};




}
