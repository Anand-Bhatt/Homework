Feature: Nopcommerce demo homepage feature
  As a user I want to check all categories link on homepage

@Smoke
  Scenario Outline: User should be able to click on all categories on homepage
    Given I am on Nopcommerce demo homepage
    When I click on "<category>"
    Then I should be able to see sub-category of "<category>"
    Examples:
      | category          |
      | Computers         |
      | Electronics       |
      | Apparel           |
      | Digital Downloads |
      | Books             |
      | Jewelry           |
      | Gift Cards        |
