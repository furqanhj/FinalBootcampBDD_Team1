Feature: ebay music features

  Background:
    Given User is on Ebay Music page

  Scenario Outline: User should be able to search for multiple items
    When User enters "<searchItems>" in the search field
    And User should see "<expectedValue>" written in the search field
    Then User should see "<PageURL>" as the current URL

    Examples:
      | searchItems   | expectedValue | PageURL                                                                                      |
      | Jazz          | Jazz          | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=Jazz&_sacat=0             |
      | Classical     | Classical     | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=Classical&_sacat=0|
      | BTS           | BTS           | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=BTS&_sacat=0              |
      | Tokyo Machine | Tokyo Machine | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=Tokyo+Machine&_sacat=0     |
      | Trap remix    | Trap remix    | https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=Trap+remix&_sacat=0       |
