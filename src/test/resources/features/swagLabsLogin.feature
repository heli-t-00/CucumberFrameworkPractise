Feature: Swag Labs Login

  Background:
    Given the user is on the Login page

  Scenario: Successful login to Swag labs valid credentials
    Given the user enters valid credentials
    When the user clicks the Login button
    Then the user successfully login


