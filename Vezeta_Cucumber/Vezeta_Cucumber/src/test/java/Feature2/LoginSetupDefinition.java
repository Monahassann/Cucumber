package Feature2;

import Pages.BasePage;
import Pages.Login;
import Pages.SignUp;
import Utilities.DriverSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class LoginSetupDefinition {
    WebDriver driver;
    SoftAssert sAssert = new SoftAssert();
    BasePage basePage;
    Login login;

    @Given("navigated to login page")
    public void navigated_to_LoginPage() {
       /* WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.vezeeta.com/");
        driver.manage().window().maximize();*/
        driver= DriverSetup.chooseBrowser("chrome","https://www.vezeeta.com/");
        basePage = new BasePage(driver);
        basePage.switchToEnglish();
        basePage.clickLogin();
    }
    @When("unregistered email and password are entered")
    public void unregistered_emailPassword_entered(){
       login  = new Login(driver);
        login.enterUsername("monaibrahim679@gmail.com");
        login.enterPass("mona2025/");
        login.pressLoginButton();
    }
    @When("clicked on submit button")
    public void clicked_on_submit_button(){login.clickLogin();
    }
    @Then("error message will be displayed")
    public void error_message() {
        sAssert.assertEquals(login.invalidLogin(),"Mobile number/Email or password is incorrect. please try again");
        sAssert.assertAll();
    }

}
