Feature: Tasks Functions
User can create a contact, edit / view / delete a task

Scenario: Create a task
Given User must have logged in
When User creates a new task

@RegressionTest
Scenario: View task
Given User must have logged in
When User View a task details

@SmokeTest
Scenario: Edit a task
Given User must have logged in
When User edit a task details

@RegressionTest
Scenario: Delect a task
Given User must have logged in
When User delete a task