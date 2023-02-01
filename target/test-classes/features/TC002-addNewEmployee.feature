Feature: Home

  @Test
  Scenario: Ensure user can add new Employee
#    Given user success Login
    Given user is in Login page
    When  user input username
    And user input password
    And user click Login
    When user click PIM
    And user click Add
    And user fill Full Name
    And user fill Last Name
    And user click Save
    Then user success create new Employee
