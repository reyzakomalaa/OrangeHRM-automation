Feature: Add User
  @Test
  Scenario: Ensure user can Add User
    Given user is in Login page
    When user input username
    And user input password
    And user click Login button
    When user click Admin menu
    And user click Add button
    And user select User Role
    And user select Employee Name
    And user select Status
    And user create username
    And user create password
    And user fill confirm password
    And user click Save
    Then success Add User