Feature: ebay toys features

  Background:
    Given User is on Ebay Toy's page

  Scenario Outline: User should be able to search for multiple items
    When User enters "<searchItems>" in search field
    And User should see "<expectedValue>" written in search field
    Then User should see "<PageURL>" as current URL

    Examples:
      | searchItems  | expectedValue | PageURL                                            |
      | LOL dolls    | LOL dolls     | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497 |
      | Unicorn toys | Unicorn toys  | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497 |
      | Water toys   | Water toys    | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497 |
      | Frozen dolls | Frozen dolls  | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497 |
      | Doll house   | Doll house    | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497 |

#
#
#    Examples:
#      | searchItems  | expectedValue | PageURL                                    |
#      | LOL dolls    | LOL dolls     | https://www.ebay.com/b/Music/bn_7000710860 |
#      | Unicorn toys | Unicorn toys  | https://www.ebay.com/b/Music/bn_7000710860 |
#      | Water toys   | Water toys    | https://www.ebay.com/b/Music/bn_7000710860 |
#      | Frozen dolls | Frozen dolls  | https://www.ebay.com/b/Music/bn_7000710860 |
#      | Doll house   | Doll house    | https://www.ebay.com/b/Music/bn_7000710860 |
