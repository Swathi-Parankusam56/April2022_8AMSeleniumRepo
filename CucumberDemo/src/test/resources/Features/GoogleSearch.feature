Feature: Feature to test google search Functionality

  Scenario: Validate google search is working
    Given open the browser
    And user should be on google search page
    When user enter a test in search box
    And hit Enter
    Then user is navigated to searchresults page