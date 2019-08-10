#Author betulalaparmak
Feature: job Title From DataBase 

 @db
Scenario Outline: Verify Job Title



Given I logged in OrangeHrm
And I click on Admin link
And I click on Job Link
When I click on Job Titles 
And I get all Job Titles from UI
And I execute "<SqlQuery>"
Then I see results from UI and Database are matched
Examples:

|SqlQuery							   |
| SELECT JOB_TITLE FROM JOBS ORDER BY 1|
