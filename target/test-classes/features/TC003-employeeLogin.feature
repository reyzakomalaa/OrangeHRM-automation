Feature: Ensure user can Login as Employee

  @CreateEmployeeAccount_withCredentials
  Scenario: As a user, I can login as Employee
    Given user is in Login page
    When  user input Employee username
    And user input Employee password
    And user click Login
    Then user success Login
