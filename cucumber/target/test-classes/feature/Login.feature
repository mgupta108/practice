Feature: Application Login
  
  Background: Browser is started
  Given Validate the browser
  When Browser is triggered
  Then Check if browser is started
  
  @smokeTest @parameterizedTest
  Scenario: Home Page Default Login1
  Given User is on landing page
  When User login with username "mano" and password "xyz_abc"
  Then Home Page is populated
  And Cards displayed are "true"
  
  @smokeTest
  Scenario: Home Page Default Login1
  Given User is on landing page
  When User login with username "mano" and password "xyz"
  Then Home Page is populated
  And Cards displayed are "true"
  
 When User signs up with following details
 |mohit|mishra|well fargo|Bangalore|Software Developer|

 #if we want to use parametrization we have to use "Scenario Outline" insted of "Scenario"
 
 @parameterizedTest
 Scenario Outline: Home Page Default Login2
  Given User is on landing page
  When User login pararmterized with username <username> and password <password>
  Then Home Page is populated
 
 Examples: 
 |username|password|
 |user1|pass1|
 |user2|pass2|
 |user4|pass4|
 |user5|pass5|
 |user6|pass6|