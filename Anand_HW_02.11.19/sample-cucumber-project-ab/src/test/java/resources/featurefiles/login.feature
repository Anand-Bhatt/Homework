Feature: Nop commerce Demo Login feature
  As a user I want to login into nope commerce website

  @Sanity
  Scenario: User should navigate to login page successfully
    Given I am on home page
    When I click on Login Link
    Then I should navigate to login page successfully

  Scenario: User should login successfully
    Given I am on home page
    When I click on Login Link
    And I enter email address "abc123@gmail.com" into email field
    And I enter password "abc123" into password field
    And I click on login button
    Then I should successfully login to my account
  @Sanity
  Scenario Outline: User should not login successfully with invalid credentials
    Given I am on home page
    When I click on Login Link
    And I enter email address "<email>" into email field
    And I enter password "<password>" into password field
    And I click on login button
    Then I should not login successfully

    Examples:
      | email        | password   |
      | xyz@bbc.com  | invalid123 |
      | 78we@bbc.com | invalid1*  |
      | --t@bbc.com  |            |

