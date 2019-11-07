Feature: Nop commerce Demo Register feature
  As a user want to complete registration successfully

  Background: I am on nopcommerce registration page
    Given       I am typing https://demo.nopcommerce.com/r in my preferred browser
    When        I click on register tab from top menu bar
    Then        I should be able to see registration page

  @Regression
  Scenario: User should be able to register successfully by entering valid details in all mandatory fields
    Given I am on registration page
    When I click on male gender
    And I enter "Anand" in first name field
    And I enter "Bhatt" in last name field
    And I select day 4 from dropdown list in day field
    And I select month "June" from dropdown list in month field
    And I select year 1978 from dropdown list in Year field
    And I enter "abcd1234@gmail.com" in email field
    And I enter "Infotech Ltd" in company name field
    And I click on newsletter checkbox
    And I enter "abc123" in password field
    And I enter "abc123" in confirm password field
    And I click on register button
    Then I should be able to register successfully


