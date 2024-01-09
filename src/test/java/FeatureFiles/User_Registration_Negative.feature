Feature: User Registration Negative

  Background:
    Given  Navigate to site
    When The user should be able to click register button
  @Regression
  Scenario: User Registration Negative
    Then The user enters the same data again
    And The user click on the register button
    Then The user should be able to see the error message
