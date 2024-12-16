@swap
Feature: Swap scenarios

  Scenario Outline: Login and Go Swap Process
    When I accept cookies
    And I press login button
    And I enter username as "<username>"
    And I enter password as "<password>"
    And I press sign in button
    And login should success and see sms verification "<title>"
    And I wait for the PIN screen
    And I Enter Pin
    And I Enter Pin
    And Proceed to Swap Page And Verify
    And Select USDT Section
    And Enter 100usd Value and Press Buy
    Then Check Value is 100 as expected

    Examples:
      | username | password | title |
      | ersoyleyen_1@hotmail.com | Dorukhan.1 | Security Verification |

 