package Feature;

import Pages.BasePage;
import Pages.SignUp;
import Utilities.DriverSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class SignUpSetupDefinition {

    WebDriver driver;
    SoftAssert sAssert = new SoftAssert();
    BasePage basePage;
    SignUp signUp;

    @Given("navigated to SignUp page")
    public void navigated_to_SignUpPage() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.vezeeta.com/");
        driver.manage().window().maximize();
       // driver= DriverSetup.chooseBrowser("chrome","https://www.vezeeta.com/");
        basePage = new BasePage(driver);
        basePage.switchToEnglish();
        basePage.clickOnSignUp();
    }
    @When("registered MobileNumber is entered")
    public void registered_MobileNumber_entered(){
        signUp = new SignUp(driver);
        signUp.enterName("Mona ibrahim");
        signUp.enterMobile("01153268331");
        signUp.enterEmail("monaibrahim6792@gmail.com");
        signUp.enterPass("Mona2025/");
        signUp.genderFemale();
    }
    @When("clicked on join button")
    public void clicked_on_join_button(){signUp.clickJoin();
    }
    @Then("error message will be displayed that this mobile number is already registered")
    public void error_message() {
        sAssert.assertEquals(signUp.getSignUpMessage(),"This mobile number is already registered. Please choose another");
        sAssert.assertAll();
    }


}
