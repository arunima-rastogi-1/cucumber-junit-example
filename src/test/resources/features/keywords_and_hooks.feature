Feature: Testing Cucumber Keywords and Hooks
  This feature demonstrates the use of all Cucumber keywords and hooks.

  Background: Common setup for scenarios
    Given The application is launched
    And The user is on the login page

  @SmokeTest
  Scenario: Successful login
    Given The user enters a valid username
    And The user enters a valid password
    When The user clicks the login button
    Then The user should see the dashboard

  Scenario: Login with invalid credentials
    Given The user enters an invalid username
    And The user enters an invalid password
    When The user clicks the login button
    Then The user should see an error message

  Scenario Outline: Login with multiple credentials
    Given The user enters "<username>" as username
    And The user enters "<password>" as password
    When The user clicks the login button
    Then The user should see "<message>"

    Examples:
      | username | password | message           |
      | user1    | pass1    | dashboard         |
      | invalid1 | invalid1 | error message     |

  @RegressionTest
  Scenario: Verifying logout functionality
    Given The user is logged in
    When The user clicks the logout button
    Then The user should be redirected to the login page
