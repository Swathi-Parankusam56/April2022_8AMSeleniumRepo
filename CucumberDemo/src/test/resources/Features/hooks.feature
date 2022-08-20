Feature: Amazon product Test

	@s1
  Scenario: Verifying login is successful with valid credientials
    Given user should ne on login page
    When user fills username  and password
    And clicks on SignIn button
    Then user is navigated to the main page

	@s2
  Scenario: To check product added to addtokart page
    Given user is on product page
    When user shoud selects the product
    Then product should add to kart page
