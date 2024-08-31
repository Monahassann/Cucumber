package Pages;

import Utitlities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends HomePage{

    By loginSwip = By.xpath("//button[@class='sc-19ff8e72-0 gRLBIk']//div[@class='sc-19ff8e72-1 cKocov'] ");

    By emailInput = By.xpath("//input[@id='emailInput']");

    By continueButt = By.xpath("//button[@id='login-submit']");

    By Otp = By.xpath("//div[@class='sc-19ff8e72-1 kMBJFx']");
    By password = By.xpath("//input[@id='password']");
    By passwordSwip = By.xpath("//div[@class='sc-19ff8e72-1 cKocov']");
    By loginButton = By.xpath("//button[@class='sc-c00f55f6-1 jAHyye']");

    By verifyMyAccount = By.xpath("//span[@class='userName']");
    public Login(WebDriver driver) {
        super(driver);
    }
    public void swipLogin () {
        BrowserActions.clickOnButton(loginSwip, driver) ;
    }
   public void inputYourEmail(String text) {
        BrowserActions.sendKeys(emailInput,driver,text);
   }
   public void continueClick (){
        BrowserActions.clickOnButton(continueButt,driver);
   }
   public void LoginUsingOtp (){
        BrowserActions.clickOnButton(Otp,driver);
   }
   public void LoginUsingPassword() { BrowserActions.clickOnButton(passwordSwip,driver);};

   public void PasswordLogin(String pass) {
        BrowserActions.sendKeys(password,driver,pass);
   }
   public void clickLoginButton (){
        BrowserActions.clickOnButton(loginButton,driver);
   };
   public String verifyMyAccount() {
       return BrowserActions.getText(verifyMyAccount,driver);}

}
