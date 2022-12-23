Feature: Login
  Scenario: Ensure user can Login
    Given user is in Login page
    When user input username
    And user input password
    And user click Login button
    Then user is in Home page