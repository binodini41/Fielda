Feature: Verify the Project
Background: Common steps
Given User launch the chrome browser
When User enter the URL "https://preview.app2.fielda.com/user/login"
And User enter the email as "ivan+fielda-e@fielda.com" and password as "Go demo 8"
And user clicked on the login button
Then The page title displayed as "Home - Fielda"

Scenario: Create activity
When user click on the project
And clicked on PROJOne
When clicked on Create Activity button
And click on the Service option
And click on the Create New Activity button
And User enter title as "Demo Test"
And user select Assign To
And user select Status
And user select priority
And user select Start Date
And User select End Date
Then click on create button
And Verify the title of the activity
And Then close the browser
