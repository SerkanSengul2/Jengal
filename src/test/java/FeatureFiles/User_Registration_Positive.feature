Feature: User Registration Positive

  Scenario: Successful registration
    Given  Navigate to site
    When The user should be able to click register button
    Then The user enter valid registration details
    And The user click on the register button
    Then The user should be registered successfully