Feature: Test login Functionality

  Scenario: Check login is successful with valid credientials
    Given User is on login page
    When user enters username and password
    And Clicks on login button
    Then User is naviaged to Home Page

  Scenario Outline: Check login is successful with valid credientials
    Given User is on login page
    When user enters <username> and <password>
    And Clicks on login button
    Then User is naviaged to Home Page

    Examples: 
      | username | password |
      | ravi     | ravi1234 |
      | sai      | sai1234  |
