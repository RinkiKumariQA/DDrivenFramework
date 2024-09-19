Feature:- Login

@FirstStep
Scenario Outline:- Login Valid Input
Given User open Browser
When User entr the url "https://practicetestautomation.com/practice-test-login/"
And Enter username "<username>" and  password "<Password>"
And Click submit button
Then Validate Title "Logged In Successfully | Practice Test Automation"
And Close Browser

Examples:
|username|Password|
|student|Password123|