Feature: Login Functionality of Fielda
@sanity
Scenario: Successfully login to fielda
Given User launch the chrome browser
When User enter the URL "https://preview.app2.fielda.com/user/login"
And User enter the email as "ivan+fielda-e@fielda.com" and password as "Go demo 8"
And user clicked on the login button
Then The page title displayed as "Home - Fielda"
#When User clicked on logout
#Then The page title displayed as "Login - Fielda"
And Then close the browser

@regression
Scenario Outline:Login with data driven
Given User launch the chrome browser
When User enter the URL "https://preview.app2.fielda.com/user/login"
And User enter the email as "<Email>" and password as "<password>"
And user clicked on the login button
Then The page title displayed as "Home - Fielda"
#When User clicked on logout
#Then The page title displayed as "Login - Fielda"
And Then close the browser

Examples:
|Email|password|
|ivan+fielda-e@fielda.com|Go demo 8|
|ivan+fielda-e@fielda.com|Go demo |