Feature: Ensure user can add new employee

#  @Test
  Scenario: As a user, I can add new Employee with Login Details toggle disabled
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

#  @Test
  Scenario: As a user, I can add new Employee with Login Details toggle enabled and Status enabled
    Given user is in Login page
    When  user input username
    And user input password
    And user click Login
    When user click PIM
    And user click Add
    And user fill Full Name
    And user fill Last Name
    When user enable Login Details toggle
    And user fill Username
    And user select status Enabled
    And user fill Password
    And user fill Confirm Password
    And user click Save
    Then user success create new Employee