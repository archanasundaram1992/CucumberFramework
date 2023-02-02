Feature: Verify Login

Scenario: Successfull login with valid credentials
Given User is on Login page
When User sign in using "amazon.test.selenium@gmail.com" and "amazonpassword"
Then validate if login is successfull
And user logout from account
