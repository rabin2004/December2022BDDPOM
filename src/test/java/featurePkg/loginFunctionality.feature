#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Release1.0
Feature: Login funtionality
As a user, I should be able to login with valid credentials

@SmokeTest @Regression
Scenario: Negative login functionality test with both invalid credentials
Given user is in homepage
And user clicks on Account list link
And user is in login page
When user enters invalid username
And clicks continue button
And enters invalid password
And clicks sign in button
Then login should be failed showing error message

@SmokeTest @DataDriven @Regression
Scenario Outline: Negative login functionality test in data driven format
Given user is in homepage
And user clicks on Account list link
And user is in login page
When user enters invalid username "<username>"
And clicks continue button
And enters invalid password "<password>"
And clicks sign in button
Then login should be failed showing error message

Examples:
|username|password|
|test@gmail.com|test@12|
|test12@gmail.com|test@123|

