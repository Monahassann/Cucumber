package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignUp extends BasePage{
    By Name = By.xpath("//input[@id = 'formik-input__input--fullName']");
    By mobileNumber = By.xpath("//input[@id = 'formik-input__input--fullName']//following::input[1]");
    By emailAddress = By.xpath("//input[@id = 'formik-input__input--fullName']//following::input[2]");
    By password = By.xpath("//input[@id = 'formik-input__input--password']");

    By female = By.xpath("//span[@id = 'formik-form__radio-button--female--selector']");
    By male = By.xpath("//span[@id = 'formik-form__radio-button--male--selector']");

    By joinNow = By.xpath("//button[@class='Buttonstyle__ButtonStyle-sc-19jncun-0 fNENyd']");

    By registeredMessage = By.xpath("//div[@class='Commonstyle__Error-sc-1vgucvm-0 jjNxQN']");

    public SignUp(WebDriver driver) {
        super(driver);
    }

    public void enterName (String name) {
        BrowserActions.sendKeys(Name,driver,name);
    }
    public void enterMobile (String mobile) {
        BrowserActions.sendKeys(mobileNumber,driver,mobile);
    }
    public void enterEmail (String email) {
        BrowserActions.sendKeys(emailAddress,driver,email);
    }
    public void enterPass (String pass) {
        BrowserActions.sendKeys(password,driver,pass);
    }
    public void genderFemale () {
        BrowserActions.clickOnButton(female,driver);
    }
    public void genderMale () {
        BrowserActions.clickOnButton(male,driver);
    }
    public void clickJoin() {
       // BrowserActions.waitUntilElementLocated(driver,joinNow);
        //BrowserActions.scrollElement(joinNow,driver);
        driver.findElement(joinNow).sendKeys(Keys.PAGE_DOWN);
        BrowserActions.clickOnButton(joinNow,driver);
    }
    public String getSignUpMessage(){
       return BrowserActions.getText(registeredMessage,driver);}
}
