Feature: Add Employee Excel

Scenario: Add Employee From Excel

Given I logged in OrangeH
And I click on PIM
And I click on Add Employee
When I send firstname,middlename,lastname,location
And click Save Button
Then I see employee added

