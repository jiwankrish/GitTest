Feature: As a user I want a login page so that only authentic users will be able to login 
Scenario Outline: Valid users should be able to login using embedded parameters 
	Given The user is on Login Page 
	When The user enter valid "<userName>" and "<password>" 			
	And The user click enter
	Then Displays Dashboard Page
	Examples: 
			|userName				|password	|
			|techfiosdemo@gmail.com |abc123		|
		
	