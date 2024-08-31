package Feature;

import Pages.HomePage;
import Pages.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSetupDefinition {
    WebDriver driver;
    WebDriverWait wait;

    HomePage homePage;
    Login login;

    @Given("navigated to login page")
    public void navigated_to_login_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        homePage.clickLogin();
    }
    @When("valid email is entered")
    public void valid_email_is_entered(){
        login = new Login(driver);
        login.swipLogin();
        login.inputYourEmail("monaibrahim679@gmail.com");
    }
    @When("clicked on continue button")
    public void clicked_on_continue_button(){
        login.continueClick();
    }
    @When("enter your password")
    public void enter_your_password(){
        login.LoginUsingPassword();
        login.PasswordLogin("Mona2025/");
    }

    @Then("user's home page is displayed")
    public void user_home_page_is_displayed () {
        login.verifyMyAccount();
    }




}
