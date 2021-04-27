Feature: Ebay fashion features
#RUNNING TESTS ON THIS PAGE
  Background:

    Given User is on the ebay fashion page

    Scenario Outline: User should be able to search for multiple items
      When User enters "<searchItems>" in search field
      And User should see "<expectedValue>" written in search field
      Then User should see "<pageURL>" as current URL






      Examples:
      | searchItems         | expectedValue      | pageURL                                      |
      | Michael Kors watch  | Michael Kors watch | https://www.ebay.com/b/Fashion/bn_7000259856 |
      | Hermes Purse        | Hermes Purse       | https://www.ebay.com/b/Fashion/bn_7000259856 |
      | Chanel Boy Bag      | Chanel Boy Bag     | https://www.ebay.com/b/Fashion/bn_7000259856 |
      | Valentino Heels     | Valentino Heels    | https://www.ebay.com/b/Fashion/bn_7000259856 |
      | Fendi Purse         | Fendi Purse        | https://www.ebay.com/b/Fashion/bn_7000259856 |


      #ctrl, alt, L t line them together