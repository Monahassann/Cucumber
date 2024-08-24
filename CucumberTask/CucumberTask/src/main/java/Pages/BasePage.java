package Pages;

import Utitlities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
        WebDriver driver ;
        WebDriverWait wait;

        By Register = By.xpath("//a[@class='ico-register']");
        By  Login = By.xpath("//a[@class='ico-login']");
        By shoppingCart = By.xpath("//a[@class='ico-cart']");

        public BasePage(WebDriver driver) {
            this.driver = driver;
        }

        public void clickRegisterButton () { BrowserActions.clickOnButton(Register,driver);};
        public void clickLogButton() {  BrowserActions.clickOnButton(Login,driver);};
        public void clickShoppingCart() { BrowserActions.clickOnButton(shoppingCart,driver);};
    }

