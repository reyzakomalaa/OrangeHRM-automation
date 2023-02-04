Feature: Ensure user can change profile

  @ChangeProfile
  Scenario: As a user, I can change my Profile (Nationality, Marital Status, Gender)
    Given user is in Login page
    When  user input Employee username
    And user input Employee password
    And user click Login
    When user click My Info
    And user change Nationality
    And user change Marital Status
    And user change Gender
    And user click Save
    Then user success change Profile

  @ChangeEmployeeProfile
  Scenario: As a user, I can change my Employee Profile (Nationality, Marital Status, Gender)
    Given user is in Login page
    When  user input Admin username
    And user input Admin password
    And user click Login
    When user click My Info
    And user click Pencil icon
    And user change Nationality
    And user change Marital Status
    And user change Gender
    And user click Save
    Then user success change Profile