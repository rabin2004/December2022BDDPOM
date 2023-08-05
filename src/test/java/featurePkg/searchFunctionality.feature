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

@Release2.0
Feature: Search funtionality
As a user, I should be able to search for available product

@SmokeTest @Regression
Scenario: Positive search functionality test by clicking search button
Given user is in homepage
When customer enter valid product in search textbox
And clicks search button
Then user should be in search result page
And user should be able to see available products

@SmokeTest @Regression
Scenario: Negative search functionality test by clicking search button
Given user is in homepage
When customer enter invalid product in search textbox
And clicks search button
Then user should see no available product error message

@SmokeTest @Regression
Scenario: Positive search functionality test by hitting enter key
Given user is in homepage
When customer enter valid product in search textbox
And hits enter key
Then user should be in search result page
And user should be able to see available products

@SmokeTest @Regression
Scenario: Negative search functionality test by hitting enter key
Given user is in homepage
When customer enter invalid product in search textbox
And hits enter key
Then user should see no available product error message

@SmokeTest @E2E @DataDriven @Regression
Scenario Outline: Positive search functionality test data driven
Given user is in homepage
When customer enter valid product "<validProduct>" in search textbox
And clicks search button
Then user should be in search result page "<validProduct>"
And user should be able to see available products

Examples:
|validProduct|
|apple|
|samsung|
|pixel|

@SmokeTest @E2E @DataDriven @Regression @newScenario
Scenario Outline: Negative search functionality test data driven
Given user is in homepage
When customer enter invalid product "<invalidProduct>" in search textbox
And clicks search button
Then user should see no available product error message

Examples:
|invalidProduct|
|*^(*^*(^*@^*@(*89898342230957329523890|
|*^(*^*(^*@^*@(*89898342230957329523891|
|*^(*^*(^*@^*@(*89898342230957329523892|