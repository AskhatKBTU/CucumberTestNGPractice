Feature: Login

In order to perform successful login
As a user
i want to enter correct username and password

Scenario: In order to verify login on facebook
	Given user navigates to facebook website
	When user validates the homepage title
	Then user entered the username
	And user entered the password
	Then user should be successfullt logged in
	