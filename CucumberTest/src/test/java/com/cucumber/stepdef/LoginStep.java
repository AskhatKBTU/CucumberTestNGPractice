 package com.cucumber.stepdef;
 

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
	   
		System.out.println("@Given --  User navigagtes to Facebook.com");
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
		System.out.println("@When -- user validates the homepage title");
	   
	}

	@Then("^user entered the username$")
	public void user_entered_the_username() throws Throwable {
		System.out.println("@Then -- user entered the username");
	}

	@Then("^user entered the password$")
	public void user_entered_the_password() throws Throwable {
		System.out.println("@Then -- user entere the password");
	  
	}

	@Then("^user should be successfullt logged in$")
	public void user_should_be_successfullt_logged_in() throws Throwable {
			
		System.out.println("@Then -- user entere the password");
	}

	
}
