Feature: user will be accessing all the elements on deals page.

  Background:

    Given User is on the deals page

  Scenario: User should be able to go to tech deals page
    When User clicks on the tech link
    Then User should land on the tech deals page


  Scenario: User should be able to go to fashion page
    When User click on the fashion link
    Then User should land on the fashion page

# ///////////////////////////////////////////////////////////////////////////////////////////////

  Scenario Outline: : User should be able to search for multiple items
    When User enters "<searchItems>" in search field
    And User should see "<expectedValue>" written in search field
    Then User should see "<pageURL>" as current URL


    Examples:
      | searchItems             | expectedValue            | pageURL                    |
      | Vacuum                  | Vacuum                   | https://www.ebay.com/deals |
      | Macbook                 | Macbook                  | https://www.ebay.com/deals |
      | Sunglasses              | Sunglasses               | https://www.ebay.com/deals |
      | Bose Wireless Headphone | Bose Wireless Headphones | https://www.ebay.com/deals |
      | Kitchen Aid             | Kitchen Aid              | https://www.ebay.com/deals |
      | Gloves                  | Gloves                   | https://www.ebay.com/deals |