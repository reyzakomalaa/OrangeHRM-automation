Feature: Ensure user can Punch In and Punch Out

  @PunchIn
  Scenario: As a user, I can do Punch In
    Given user is in Login page
    When  user input Employee username
    And user input Employee password
    And user click Login
    When user click Time
    And user click Attendance
    And user click Punch In OR Out
    And user click In
    Then user success Punch In OR Out

  @PunchOut
  Scenario: As a user, I can do Punch Out
    Given user is in Login page
    When  user input Employee username
    And user input Employee password
    And user click Login
    When user click Time
    And user click Attendance
    And user click Punch In OR Out
    When user fill Note
    And user click In
    Then user success Punch In OR Out
    When user fill Note
    And user click Out
    Then user success Punch In OR Out