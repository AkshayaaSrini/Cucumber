Feature: To validate the Login functionality
Scenario Outline: To validate the Login functionality
Given User is on Facebook application Login Page
When User enter "<username>" and "<password>"
And User Click Login button
Then User should be in invalid Credentials Page

Examples:
|username|password|
|akshu|akshu@123|
|srini|srini@456|
|tester|tester@50|
|selenium|sele@678|