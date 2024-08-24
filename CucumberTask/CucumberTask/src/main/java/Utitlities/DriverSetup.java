package Utitlities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {
    static WebDriver driver;
    public static WebDriver chooseBrowser (String Name,String url) {
        if (Name.equals("Chrome")|| Name.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (Name.equals("Edge")||Name.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else{
            System.out.println("driver is not found");
        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}
