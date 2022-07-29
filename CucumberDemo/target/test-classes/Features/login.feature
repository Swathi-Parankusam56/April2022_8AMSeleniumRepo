Feature: Test login Functionality

  @regression
  Scenario: Check login is successful with valid credientials
    Given User is on login page
    When user enters username and password
    And Clicks on login button
    Then User is naviaged to Home Page

	@smoke
  Scenario: Demo Scenario
    Given User is on login page
    When user enters username and password
    And Clicks on login button
    Then User is naviaged to Home Page
