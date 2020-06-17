$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/LoginToFielda.feature");
formatter.feature({
  "name": "Login Functionality of Fielda",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successfully login to fielda",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginScreen.User_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the URL \"https://preview.app2.fielda.com/user/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginScreen.User_enter_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the email as \"ivan+fielda-e@fielda.com\" and password as \"Go demo 8\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginScreen.User_enter_the_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginScreen.user_clicked_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page title displayed as \"Home - Fielda\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginScreen.The_page_title_displayed_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Then close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginScreen.Then_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with data driven",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter the URL \"https://preview.app2.fielda.com/user/login\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enter the email as \"\u003cEmail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicked on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The page title displayed as \"Home - Fielda\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Then close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email",
        "password"
      ]
    },
    {
      "cells": [
        "ivan+fielda-e@fielda.com",
        "Go demo 8"
      ]
    },
    {
      "cells": [
        "ivan+fielda-e@fielda.com",
        "Go demo"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with data driven",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginScreen.User_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the URL \"https://preview.app2.fielda.com/user/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginScreen.User_enter_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the email as \"ivan+fielda-e@fielda.com\" and password as \"Go demo 8\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginScreen.User_enter_the_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginScreen.user_clicked_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page title displayed as \"Home - Fielda\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginScreen.The_page_title_displayed_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Then close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginScreen.Then_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with data driven",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginScreen.User_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the URL \"https://preview.app2.fielda.com/user/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginScreen.User_enter_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the email as \"ivan+fielda-e@fielda.com\" and password as \"Go demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginScreen.User_enter_the_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginScreen.user_clicked_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page title displayed as \"Home - Fielda\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginScreen.The_page_title_displayed_as(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat stepDefinations.LoginScreen.The_page_title_displayed_as(LoginScreen.java:104)\r\n\tat ✽.The page title displayed as \"Home - Fielda\"(./Features/LoginToFielda.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Then close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginScreen.Then_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});