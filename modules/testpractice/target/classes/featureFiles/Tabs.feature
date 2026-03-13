Feature: validating tabs

# Scenario: verify header and url of tabs page
# Given User is on Home page
# When User navigates to Tabs page
# Then the url should be "https://projects.hackerearth.com/p4/index.html#/tabs"
# And the header should be "Tabs"


Scenario: get button text
Given User is on Home page
And User navigates to Tabs page
And User clicks the Tab1 button
When User clicks the test button
Then the button text should be "Test Button"