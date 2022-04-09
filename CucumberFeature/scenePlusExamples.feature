@tewst
Feature: Search testing

Background: 
Given user on home page  #will run first b/c of Background


Scenario Outline: positive scenraio for searching
Given user logs in
When user enters <"search field"> and <"first name">  in search field
And user clicks search
Then website searchs

Examples:

search field first name
QA testing  Nibir
apple					

@test2
Scenario: positive scenraio for searching
Given user logs in
When user enters <"search field"> and <"first name">  in search field
And user clicks search
Then website searchs
