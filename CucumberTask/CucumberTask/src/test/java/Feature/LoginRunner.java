package Feature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = "Feature", features = "src/test/java/Feature/Login.feature" ,
plugin = {"pretty", "html:tsrget/cucumber-html-report"})

public class LoginRunner extends AbstractTestNGCucumberTests {
}
