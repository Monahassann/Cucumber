package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    By openMenu = By.xpath("//button[@aria-label='Open Menu']");
    By signUp = By.xpath("//a[@id='Header_button_link_Sign Up--false']");
    By Login = By.xpath("//a[@id='Header_button_link_Sign Up--false']//following::a[1]");
    By vezeetaForDoctors = By.xpath("//a[@id='Header_button_link_Sign Up--false']//following::a[2]");
    By contactUs = By.xpath("//a[@id='Header_button_link_Sign Up--false']//following::a[3]");
    By language = By.xpath("//a[@id='Header_button_link_Sign Up--false']//following::a[4]");
    By country =  By.xpath("//span[@class='SelectCountrystyle__PrimaryCountryText-sc-1qkgat9-8 khnJCJ']");
    By selectSpeciality = By.xpath("//button[@id='selectSpecialityDropdown']");
    By chooseCity = By.xpath("//button[@id='selectCityyDropdown']");
    By chooseArea = By.xpath("//button[@id='selectAreaDropdown']");
    By searchByName = By.xpath("//input[@class='HeaderDropdownstyle__TextInput-sc-1qqkq7m-9 eyCUsh']");

    By clickOnSearchButton = By.xpath("SearchBarstyle__SearchBarButton-sc-1pey3th-2 SearchBarstyle__HeaderSearchButton-sc-1pey3th-3 goyPCr jxctIN");

    By arabicLanguageClick = By.xpath("//a[@class='HeaderTopBarstyle__HeaderNavLink-sc-1o1fu0h-2 cVxliK']");

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSignUp () {
        BrowserActions.clickOnButton(signUp, driver);
    }
    public void clickLogin () {
        BrowserActions.clickOnButton(Login, driver);
    }
    public void vezeetaForDoctors () {
        BrowserActions.clickOnButton(vezeetaForDoctors, driver);
    }
    public void ClickOnContact () {
        BrowserActions.clickOnButton(contactUs, driver);
    }
    public void clickLanguage () {
        BrowserActions.clickOnButton(language, driver);
    }
    public void selectCountry (String text) {
        Select selectCountry = new Select(driver.findElement(country));
       selectCountry.selectByVisibleText(text);
    }

    public void speciality (String text) {
        Select specialitySelect = new Select(driver.findElement(selectSpeciality));
        specialitySelect.selectByVisibleText(text);
    }

    public void city (String text) {
        Select citySelect = new Select(driver.findElement(chooseCity));
        citySelect.selectByVisibleText(text);
    }
    public void area (String text) {
        Select areaSelect = new Select(driver.findElement(chooseArea));
        areaSelect.selectByVisibleText(text);
    }
    public void searchName(String text) {
        BrowserActions.sendKeys(searchByName,driver,text);
    }
    public void clickSearch () {
        BrowserActions.clickOnButton(clickOnSearchButton,driver);
    }
    public void switchToEnglish(){BrowserActions.clickOnButton(arabicLanguageClick,driver);}







}
