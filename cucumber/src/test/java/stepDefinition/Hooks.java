package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@parameterizedTest or @smokeTest")
	public void beforeLaunchValidation() {
		System.out.println("Before Method called from hook --------------------------------");
	}
	
	@After("@parameterizedTest or @smokeTest")
	public void afterLaunchValidation() {
		System.out.println("Before Method called from hook --------------------------------");
	}
}
