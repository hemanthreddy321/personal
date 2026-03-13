Feature: Validating dynamic table

Scenario: validating the url and header of dynamic table page
Given User is on Home page
When User navigates to dynamic table page
Then the url should be "https://projects.hackerearth.com/p4/index.html#/dynamic-table"
And the header should be "Dynamic Table"


Scenario: validating the table user name and age
Given User is on Home page
And User navigates to dynamic table page
When User clicks the add row button
Then the user name should be "New User 4"
And the user age should be "25"