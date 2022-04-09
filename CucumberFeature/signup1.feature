Feature: Login functionality 
@test1
Scenario: check with valid credentials

Given user is on the home page 
When user clicks sign in button 
And enters an email
And clicks continue 
And enters the password
And clicks the log in button
Then it should log them in 

#this is my comment 

