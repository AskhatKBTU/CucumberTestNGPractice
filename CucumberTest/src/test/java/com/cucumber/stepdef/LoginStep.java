 package com.cucumber.stepdef;
 

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
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

	@Then("^user entered \"([^\"]*)\" username$")
	public void user_entered_valid_username(String username) throws Throwable {
		System.out.println("@Then -- user entered " +username + " the username");
	}

	@Then("^user entered \"([^\\\"]*)\\\" password$")
	public void user_entered_valid_password(String password) throws Throwable {
		System.out.println("@Then -- user entere "+password+" the password");
	  
	}
	
	@And ("^user select the age category$")
	public void user_select_the_age_category(DataTable table) throws Throwable {
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		System.out.println("@And -- user selects the age: "+data.get(0).get("Age")+ "--Selected location as :"+data.get(0).get("location"));
	}

	@Then("^user \"([^\"]*)\" be successfullt logged in$")
	public void user_should_be_successfullt_logged_in(String validateLogin) throws Throwable {
			
		System.out.println("@Then -- user " +validateLogin+" entere the password");
	}

	
}
