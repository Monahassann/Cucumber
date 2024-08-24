package Pages;

import Utitlities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{

    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@name='Email']");
    By day = By.xpath("//div//select[@name='DateOfBirthDay']");
    By month = By.xpath("//div//select[@name='DateOfBirthMonth']");
    By year = By.xpath("//div//select[@name='DateOfBirthYear']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");

    By validateRegister = By.xpath("//div[@class='message-error validation-summary-errors']");
    public RegisterPage(WebDriver driver) {super(driver);}
    public void typeInFirstName(String text) {BrowserActions.sendKeys(firstName,driver,text);};
    public void typeInLastName(String text) {BrowserActions.sendKeys(lastName,driver,text);};
    public void typeInEmail(String text) {BrowserActions.sendKeys(email,driver,text);};
    public void  selectYear (int index) {BrowserActions.waitUntilElementIsVisible(wait,driver,year);
        Select sYear = new Select(driver.findElement(year));
        sYear.selectByIndex(index);};
    public void  selectMonth (int index) { BrowserActions.waitUntilElementIsVisible(wait,driver,month);
        Select sMonth = new Select(driver.findElement(month));
        sMonth.selectByIndex(index);};
    public void  selectDay (int index) {
        BrowserActions.waitUntilElementIsVisible(wait,driver,day);
        Select sDay = new Select(driver.findElement(day));
        sDay.selectByIndex(index);};
    public  void typePassword (String text) { BrowserActions.sendKeys(password,driver,text);};
    public  void typeConfPassword (String text) { BrowserActions.sendKeys(confirmPassword,driver,text);};
    public void  clickOnRegisterButton () { BrowserActions.clickOnButton(registerButton,driver);};

    public String validateRegister () { return BrowserActions.getText(password,driver);};

}