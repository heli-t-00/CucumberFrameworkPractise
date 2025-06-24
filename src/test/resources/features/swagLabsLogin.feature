Feature: Swag Labs Login

  Background:
    Given the user is on the Login page

  Scenario: Successful login to Swag labs valid credentials
    Given the user enters valid credentials
    When the user clicks the Login button
    Then the user successfully login

  Scenario: Unsuccessful login to Swag labs invalid credentials
    Given the user enters invalid credentials
    When the user clicks the Login button
    Then the user unsuccessfully login

#    Using Scenario Outline combines both the scenarios above therefore can use Scenario Outline to cover BOTH the scenario rather than having Multiple Step defs

    Scenario Outline: Login attempt with various credentials
      Given the user enters username "<username>" and password "<password>"
      When the user clicks the Login button
      Then the login should be "<result>"

      Examples:
        | username      | password     | result       |  |
        | standard_user | secret_sauce | successful   |  |
        | invalid_user  | wrong_p      | unsuccessful |  |