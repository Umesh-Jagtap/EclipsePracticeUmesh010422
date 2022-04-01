Feature: Application Login

Scenario: Home page default Login
Given User is on netbanking landing page
When User login into application with "umesh" and password "1234"
Then Home page is poped
And Cards displayed are "true"




Scenario: Home page default Login
Given User is on netbanking landing page
When User login into application with "shekhar" and password "4321"
Then Home page is poped
And Cards displayed are "false"