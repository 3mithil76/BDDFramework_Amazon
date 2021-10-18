Feature: Amazon Add to Cart feature

@SmokeTest @RegTest @ATest
Scenario: Amazon Add to Cart Test Scenario

Given user is on home page and logged in
When user search for "trimmer"
Then user adds product to the cart
Then verify the product in the cart
Then User close the browser
