package Feature;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginSetupDefinition {
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    HomePage homePage;
    LoginPage loginPage;

    @Given("navigated to login page")
    public void navigated_to_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        homePage.clickLogButton();
    }
    @When("valid username and password are entered")
    public void valid_username_and_password_are_entered() {
        loginPage = new LoginPage(driver);
        loginPage.writeEmail("monaibrahim99069@gmail.com");
        loginPage.writePassword("Mona2025/");
    }

    @When("invalid username and password are entered")
    public void invalid_username_and_password_are_entered() {
        loginPage = new LoginPage(driver);
        loginPage.writeEmail("mona1234hfkk@gmail.com");
        loginPage.writePassword("Mona2025/");
    }
    @When("clicked on submit button")
    public void clicked_on_submit_button(){
        loginPage.pressOnLogin();
    }
    @Then("user's home page is displayed")
    public void users_homepage_is_displayed() {
      softAssert.assertEquals( homePage.welcomeText(), "Welcome to our store");
    }

    @Then("error message will be displayed")
    public void error_message_will_be_displayed(){
        softAssert.assertEquals(loginPage.unSuccessLogin(),"Wrong email");
        //softAssert.assertAll();
    }

    @When("invalid username {string} and password {string} are entered")
    public void invalidUsernameAndPasswordAreEntered(String arg0, String arg1) {
        loginPage = new LoginPage(driver);
        loginPage.writeEmail(arg0);
        loginPage.writePassword(arg1);
    }
}
