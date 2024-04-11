Feature: Verify the login functionality of abc application
Scenario: Verify using valid username and invalid password
Given user is on abc application
When user enter  username and password
And user clicks login button
Then user gets response message
