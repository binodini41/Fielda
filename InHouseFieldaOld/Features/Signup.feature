Feature: Signup feature in fielda
@Signup
Scenario Outline: Verify Sign up feature
Given User launch the chrome browser
When User enter the URL "https://preview.app2.fielda.com/user/login"
And Click on the Sign up here link
Then The page title displayed as "sign-up - Fielda"
And Enter email id as "<Email>" and password as "<password>" and confirm password as "<cpassword>" and display name as "<dname>"
And Click on Create a Account button
Then The page title displayed as "sign-up - Fielda"
And Then close the browser

Examples:
|Email|password|cpassword|dname|
|siva.nagarajan@kanini.com|Lucky@1234|Lucky@1234|SivaNa|


