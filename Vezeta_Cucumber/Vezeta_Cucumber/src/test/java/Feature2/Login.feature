Feature: Login functionality

  Scenario: Invalid login
    Given navigated to login page
    When unregistered email and password are entered
    And clicked on submit button
    Then error message will be displayed