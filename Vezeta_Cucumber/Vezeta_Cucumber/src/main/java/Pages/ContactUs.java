package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUs extends BasePage {

    By contactName = By.id("formik-input__input--fullName");
    By contactMobile = By.id("phoneNumber");
    By contactCountry = By.xpath("//div[@class='selected-flag']");
    By contactEmail = By.id("formik-input__input--email");
    By sendButton = By.id("Generated_Button_ID_57");
    By message = By.xpath("//textarea[@name='comment']");

    public ContactUs(WebDriver driver) {
        super(driver);
    }

    public void typeContactName(String text){BrowserActions.sendKeys(contactName,driver,text);};
    public void typeContactMobile(String text){BrowserActions.sendKeys(contactMobile,driver,text);};
    public void enterContactCountry(int index){
        Select selectCountry = new Select(driver.findElement(contactCountry));
    selectCountry.selectByIndex(index);};

    public void typeMessage(String text){BrowserActions.sendKeys(message,driver,text);};
    public void typeContactMail(String text){BrowserActions.sendKeys(contactEmail,driver,text);};
    public void clickSendButton(){BrowserActions.clickOnButton(sendButton,driver);};
}
