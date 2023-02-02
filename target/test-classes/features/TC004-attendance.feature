Feature: Ensure user can Punch In and Punch Out

#  @Test
  Scenario: As a user, I can do Punch In
    Given user is in Login page
    When  user input username
    And user input password
    And user click Login
    When user click Time
    And user click Attendance
    And user click Punch In OR Out
    And user click In
    Then user success Punch In OR Out

  @Test
  Scenario: As a user, I can do Punch Out
    Given user is in Login page
    When  user input username
    And user input password
    And user click Login
    When user click Time
    And user click Attendance
    And user click Punch In OR Out
    And user click In
    And user click Out
    Then user success Punch In OR Out