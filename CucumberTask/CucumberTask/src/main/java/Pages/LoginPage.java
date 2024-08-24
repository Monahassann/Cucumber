package Pages;

import Utitlities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By typeInEmail = By.xpath("//input[@id='Email']");
    By typeInPassword =     By.xpath("//input[@id='Password']");
    By pressLoginButton = By.xpath("//button[@class= 'button-1 login-button']");

    By errorMessageLoginUnSuccess = By.xpath("//div[@class='message-error validation-summary-errors']");

    public  LoginPage (WebDriver driver) {super(driver);};
    public void writeEmail (String text) {
        BrowserActions.sendKeys(typeInEmail,driver,text);};
    public void writePassword(String text) {BrowserActions.sendKeys(typeInPassword,driver,text);};
    public void  pressOnLogin () {BrowserActions.clickOnButton(pressLoginButton,driver);};
    public String unSuccessLogin() { return BrowserActions.getText(pressLoginButton,driver);};
}
