Feature: Login

In order to perform successful login
As a user
i want to enter correct username and password

Scenario Outline: In order to verify login on facebook
	Given user navigates to facebook website
	When user validates the homepage title
	Then user entered "<username>" username
	And user entered "<password>" password
	Then user "<loginType>" be successfullt logged in
	
Examples:
| username | password | loginType |
| valid    | valid    | should    |
| invalid  | invalid  | shouldnot |
	
		
	
	