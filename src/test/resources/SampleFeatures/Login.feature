Feature: Login Function

#Scenario: Valid Login
#Given User is on Login Page
#When User enters login credentials
#Then User should be navigated to Home Page

Scenario: Valid Login
Given User is on Login Page
When User enters login credentials
  | username | password |
  | tomsmith | SuperSecretPassword! |
Then User should be navigated to Home Page

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then User should be navigated to Home Page

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then User should be navigated to Home Page

#Examples:
 # | username | password |
 # | testuser1 | welcome1 |
 # | testuser2 | welcome2 |
 # | tomsmith | SuperSecretPassword! |