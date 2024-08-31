package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp extends HomePage{

    By signUpSwap = By.xpath("//button[@class='sc-19ff8e72-0 gRLBIk']//div[@class='sc-19ff8e72-1 kMBJFx']");

    By emailInput2 = By.xpath("//input[@id='emailInput']");

    By continueButt = By.xpath("//button[@id='login-submit']");


    public SignUp(WebDriver driver) {
        super(driver);
    }
}
