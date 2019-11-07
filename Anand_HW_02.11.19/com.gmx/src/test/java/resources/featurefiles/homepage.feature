Feature: Home Page of gmx webpage
  As a user I want to verify home page

  Scenario Outline: User should click on drop down functionality on  homepage successfully
    Given I am on homepage of gmx.com webpage
    When I click on "<category>"
    Then  I should be able to see sub-category of "<category>"
    Examples:
      | category   |
      | Free Email |
      | Features   |
      | Apps       |

