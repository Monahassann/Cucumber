Feature: Login functionality

  Scenario: Valid login
    Given navigated to login page
    When valid email is entered
    And clicked on continue button
    And enter your password
    Then user's home page is displayed


