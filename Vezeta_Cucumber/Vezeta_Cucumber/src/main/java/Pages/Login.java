package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{

    By userName =  By.xpath("//input[@id = 'formik-input__input--email']");
    By loginPass = By.xpath("//input[@id = 'formik-input__input--password']");
    By loginButton = By.xpath("//button[@class = 'Buttonstyle__ButtonStyle-sc-19jncun-0 jRJzEY']");

    By invalidMessage = By.xpath("//div[@class='Commonstyle__Error-sc-1vgucvm-0 jjNxQN']");


    public Login(WebDriver driver) {
        super(driver);
    };
    public void enterUsername (String text) {
        BrowserActions.sendKeys(userName,driver,text);
    }
    public void enterPass (String text) {
        BrowserActions.sendKeys(loginPass,driver,text);
    }

    public void pressLoginButton (){
       // driver.findElement(loginButton).sendKeys(Keys.PAGE_DOWN);
        BrowserActions.clickOnButton(loginButton,driver);
    }
    public String invalidLogin(){
        return BrowserActions.getText(invalidMessage, driver);
    }
}
