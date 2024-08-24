package Pages;

import Utitlities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By searchBox =  By.xpath("//input[@class='search-box-text ui-autocomplete-input']");
    By searchBoxClick = By.xpath("//button[@class= 'button-1 search-box-button']");

    By WelcomeText = By.xpath("//div[@class='topic-block-title']//h2");
    public  HomePage (WebDriver driver) { super(driver);};

    public void typeInSearchBox (String text) {BrowserActions.sendKeys(searchBox,driver,text);};
    public void clickOnSearch () { BrowserActions.clickOnButton(searchBoxClick,driver);};
    public String welcomeText() {return BrowserActions.getText(WelcomeText,driver);};
}
