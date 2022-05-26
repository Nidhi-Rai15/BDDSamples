@PhaseOne
Feature: Contact Functions
User can create a contact, edit / view / delete a contact

Background: Login into App
Given User must have logged in

@RegressionTest
Scenario: Create a contact
When User creates a new contact


Scenario: View contact
When User View a contact details

 
Scenario: Edit a contact
When User edit a contact details

@SmokeTest
Scenario: Delect a contact
When User delete a contact