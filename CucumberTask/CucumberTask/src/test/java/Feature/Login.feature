Feature: Login functionality

  Scenario: Valid login
    Given navigated to login page
    When valid username and password are entered
    And clicked on submit button
    Then user's home page is displayed

  Scenario: Invalid login
    Given navigated to login page
    When invalid username and password are entered
    And clicked on submit button
    Then error message will be displayed

  Scenario: Invalid login
    Given navigated to login page
    When invalid username "monaibr23@gmail.com" and password "Mona2025/" are entered
    And clicked on submit button
    Then error message will be displayed

