Feature: Login

Scenario Outline: login with different data

Given User is on Login page
When User sign in using <email> and <password>
Then validate if login is successfull
And user logout from account
Examples:
|email  | password|
|||
|amazon.test.selenium@gmail.com|amazonpassword|
|amazon.test.selenium@gmail.com|amazon|
