@PhaseTwo
Feature: Deals Functions
User can create a contact, edit / view / delete a deal

@SmokeTest
Scenario: Create a deal
Given User must have logged in
When User creates a new deal

Scenario: View deal
Given User must have logged in
When User View a deal details

@RegressionTest
Scenario: Edit a deal
Given User must have logged in
When User edit a deal details

Scenario: Delect a deal
Given User must have logged in
When User delete a deal