Feature: Ensure user can Login
  Scenario: As a user, I can login as an Admin
    Given user is in Login page
    When  user input username
    And user input password
    And user click Login
    Then user success Login