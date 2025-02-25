package stepDefinition;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {

	@Given("^User is on landing page$")
	public void User_is_on_landing_page() {
		System.out.println("User is on landing page");
	}

	@When("^User login with username and password$")
	public void User_login_with_username_and_password() {
		System.out.println("logged in");
	}

	@Then("Home Page is populated")
	public void home_page_is_populated() {
		System.out.println("Home Page populated");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	}

	@When("User login with username {string} and password {string}")
	public void user_login_with_username_and_password(String string, String string2) {
		System.out.println("Logged in with username " + string + " and password " + string2);
	}

	@Then("Cards displayed are {string}")
	public void cards_displayed_are(String string) {
		System.out.println("Card displayed is "+string);
	}
	
	@When("User signs up with following details")
	public void user_signs_up_with_following_details(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> obj = dataTable.asLists();
		System.out.println("First Name : "+obj.get(0).get(0));
		System.out.println("Last Name : "+obj.get(0).get(1));
		System.out.println("Company Name : "+obj.get(0).get(2));
		System.out.println("Location : "+obj.get(0).get(3));
		System.out.println("Designation : "+obj.get(0).get(4));
	}
	
	 @When("^User login pararmterized with username (.+) and password (.+)$")
	    public void user_login_with_username_and_password1(String username, String password) throws Throwable {
		 System.out.println("User Name is "+username);
		 System.out.println("Password is "+password);
	    }

}
