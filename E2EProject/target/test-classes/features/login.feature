Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to the "https://qaclickacademy.com/" site
And Click on the login button to land on secure sign in page
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in
And close browser

Examples:
|username	|password	|
|test99@gmail.com	|12345	|
|test123@gmail.com	|123456	|