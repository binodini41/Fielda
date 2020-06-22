Feature: Forgot password feature
@forgotPassword
Scenario Outline: Reset the password
Given User launch the chrome browser
When User enter the URL "https://preview.app2.fielda.com/user/login"
And Click on the Forgot password link
Then The page title displayed as "Forgot Password" 
And User enter the email as "binodini.sahoo@kanini.com"
And Clicked on Resend code button
Then The page title displayed as "reset-password - Fielda" 
And User enter the new password as "<newpassword>" and confirm new password as "<cnewpassword>" and enter code as "<entercode>"
Then Clicked on change password button
And Then close the browser

Examples:
|newpassword|cnewpassword|entercode|
|Lucky123|Lucky123|456787|




