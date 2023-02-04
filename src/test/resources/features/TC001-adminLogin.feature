Feature: Ensure user can Login as Admin

  @AdminLogin
  Scenario: As a user, I can login as Admin
    Given user is in Login page
    When  user input Admin username
    And user input Admin password
    And user click Login
    Then user success Login
