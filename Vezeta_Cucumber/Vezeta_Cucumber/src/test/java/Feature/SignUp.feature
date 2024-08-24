Feature: SignUp functionality

  Scenario: Invalid login
    Given navigated to SignUp page
    When registered MobileNumber is entered
    And clicked on join button
    Then error message will be displayed that this mobile number is already registered
