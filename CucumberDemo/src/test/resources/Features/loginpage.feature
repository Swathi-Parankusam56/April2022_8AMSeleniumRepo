Feature: To Test LoginFunctionality

  Scenario Outline: To check login is successful with valid credientials
    Given navigate the browser
    And customer is on login page
    When user enters <username> and <password>
    And user should click on login
    Then user should navigate to home page

    Examples: 
      | username  | password |
      | ravilella |    12345 |
      | sai       |    12345 |
