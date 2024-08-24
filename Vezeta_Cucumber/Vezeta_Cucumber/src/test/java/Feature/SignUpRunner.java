package Feature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = "Feature", features = "src/test/java/Feature/SignUp.feature" ,
        plugin = {"pretty", "html:tsrget/cucumber-html-report"})
public class SignUpRunner extends AbstractTestNGCucumberTests {

}
