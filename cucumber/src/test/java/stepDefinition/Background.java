package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
	
	@Given("Validate the browser")
	public void validate_the_browser() {
		System.out.println("Validate the browser : executed");
	}

	@When("Browser is triggered")
	public void browser_is_triggered() {
		System.out.println("Browser is triggered : executed");
	}

	@Then("Check if browser is started")
	public void check_if_browser_is_started() {
		System.out.println("Check if browser is started : executed");
	}

}
