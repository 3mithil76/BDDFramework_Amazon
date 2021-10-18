Feature: Amazon Search Feature

@SmokeTest @E2ETest @RegTest
Scenario Outline: Amazon Search Feature Test Scenario

Given user is logged in
When user searches for the "<product>"
Then search results related to "<product>" should be displayed
Then User close the browser


Examples:

  | product | 
	| trimmer | 
  | iphone11 |

 @HotFix
Scenario Outline: Amazon Search Feature DropDown Test Scenario

Given user is logged in
When user selects specific "<department>" from dropdown
Then verify that specific "<department>" is selected
Then User close the browser

Examples:

	| department|
	| Books|
	| Music|
	
#@SmokeTest @SanityTest @RegTest @ColdFix
#Scenario: Amazon Search Feature Test Scenario Using Data Tables With List
#The only problem with this method is that you can't give more than one set of data, that's why we use data tables with Maps
#
#Given user is logged in
#When user searches for the product
 #| trimmer |
#Then search results related to product should be displayed
 #| trimmer |
#Then User close the browser 

@SmokeTest @SanityTest @RegTest @ColdFix
Scenario: Amazon Search Feature Test Scenario Using Data Tables With Maps

Given user is logged in
When user searches for the product and search results related to product should be displayed
 | productName |
 | trimmer |
 | iphone11 |
Then User close the browser
