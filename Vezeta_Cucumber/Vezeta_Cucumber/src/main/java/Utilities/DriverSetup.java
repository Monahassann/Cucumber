package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {

    static WebDriver driver;

    public static WebDriver chooseBrowser (String BrowserName , String Url) {
        if (BrowserName.equals("chrome")||BrowserName.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (BrowserName.equals("edge")||BrowserName.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else if (BrowserName.equals("firefox")||BrowserName.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Browser not found");
        }
        driver.manage().window().maximize();
        driver.get(Url);
        return driver;
    }
}
