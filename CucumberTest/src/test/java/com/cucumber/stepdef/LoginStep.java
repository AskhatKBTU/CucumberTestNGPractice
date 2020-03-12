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

	@Then("^user entered \"([a-zA-Z]{1,})\" username$")
	public void user_entered_valid_username(String username) throws Throwable {
		System.out.println("@Then -- user entered " +username + " the username");
	}

	@Then("^user entered \"([a-zA-Z]{1,})\" password$")
	public void user_entered_valid_password(String password) throws Throwable {
		System.out.println("@Then -- user entere "+password+" the password");
	  
	}

	@Then("^user \"([a-zA-Z]{1,})\" be successfullt logged in$")
	public void user_should_be_successfullt_logged_in(String validateLogin) throws Throwable {
			
		System.out.println("@Then -- user " +validateLogin+" entere the password");
	}

	
}
