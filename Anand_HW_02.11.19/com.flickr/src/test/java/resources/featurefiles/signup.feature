Feature: Sign up link on flickr.com
  As a user I want to verify sign up link.

  Scenario: User should sign up successfully
    Given I am on homepage of flickr.com webpage
    When I click on Sign Up link
    And I enter "John" in first name field
    And I enter "Smith"in last name field
    And I enter "18" as age
    And I enter random email in email field
    And I enter "Abcdabcd1234" in password field
    And I click on sign up button
    Then I should navigate to signup verification email send link




