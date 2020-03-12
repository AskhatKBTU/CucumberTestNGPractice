Feature: Login to Production

In order to perform successful login to Production
As a user
i want to enter correct username and password

Background: 
				Given user navigates to facebook website
				When user validates the homepage title

Scenario: In order to verify login on facebook
	Then user entered "valid" username
	And user entered "valid" password
	And user validates the captcha image
	Then user "should" be successfullt logged in
	
Scenario: In order to verify login on facebook
	Then user entered "invalid" username
	And user entered "invalid" password
	And user validates the captcha image
	Then user "shouldnot" be successfullt logged in
	 
		
	
	