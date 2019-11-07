Feature: Sign up link on Appearhere.co.uk
  As a user I want to verify sign up link.
  Scenario: User should sign up successfully
    Given I am on homepage of Appearhere.co.uk webpage
    When I clik on Sign Up link
    And I click on sign up with email field
    And I enter "John" in First Name field
    And I enter "Smith" in Last Name field
    And I enter random email in email field
    And I enter "Abcd1234" in password field
    And I click on sign up button
    Then I should sign up successfully and I should dashboard tab appears

