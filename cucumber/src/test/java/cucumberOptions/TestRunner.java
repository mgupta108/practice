package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/feature",
			glue = "stepDefinition",
			tags="@smokeTest or @parameterizedTest",
			plugin= {"pretty","html:target/cucumber_reports.html", "json:target/cucumber_reports.json", "junit:target/cucumber_reports.xml"}
		)

public class TestRunner {

}
