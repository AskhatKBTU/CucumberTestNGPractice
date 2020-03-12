Feature: Login

In order to perform successful login
As a user
i want to enter correct username and password

Scenario: In order to verify login on facebook
	Given user navigates to facebook website
	When user validates the homepage title
	Then user entered "valid" username
	And user entered "valid" password
	Then user "should" be successfullt logged in
	
Scenario: In order to verify login on facebook
	Given user navigates to facebook website
	When user validates the homepage title
	Then user entered "invalid" username
	And user entered "invalid" password
	Then user "shouldnot" be successfullt logged in
	
		
	
	