@test
Feature: Login scenarios

  Scenario Outline: Login with invalid username and password
    When I accept cookies
    And I press login button
    And I enter username as "<username>"
    And I enter password as "<password>"
    And I press sign in button
    Then login should fail with an error "<err>"
    Examples:
      | username | password | err |
      | invalidmail@test.com | Dorukhan.1 | Please make sure you've provided correct information. |

#  Scenario Outline: Login with invalid password
#    And I press login button
#    And I enter username as "<username>"
#    Then login should fail with an invalid password error "<err>"
#    Examples:
#      | username | password | err |
#      | invalidmail@test.com | Dorukhan.1 | This field is require.|

  Scenario Outline: Login with invalid mail
    And I press login button
    When I enter username as "<username>"
    Then login should fail with an invalid mail error "<err>"
    Examples:
      | username | password | err |
      | invalidmail@ | Dorukhan.1 | Please enter a valid e-mail or identity number. |

  Scenario Outline: Login Success
    And I press login button
    And I enter username as "<username>"
    And I enter password as "<password>"
    And I press sign in button
    Then login should success and see sms verification "<title>"
    Examples:
      | username | password | title |
      | ersoyleyen_1@hotmail.com | Dorukhan.1 | Security Verification |