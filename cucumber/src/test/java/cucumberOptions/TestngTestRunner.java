package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features = "src/test/java/feature",
			glue = "stepDefinition"
		)

public class TestngTestRunner extends AbstractTestNGCucumberTests {

}
