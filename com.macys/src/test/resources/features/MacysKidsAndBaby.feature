Feature: Macys Kids And Baby features

  Background:

    Given User is on the macys Kids And Baby

  Scenario Outline: User should be able to search for multiple items
    When User enters "<searchItems>" in search field
    And  User should see "<expectedValue>" written in search field
    Then User should see "<pageTitle>" as title




    Examples:
      | searchItems   | expectedValue | pageTitle                            |
      | Disney        | Disney        | Disney - Macy's Kids And Baby        |
      | Disney Frozen | Disney Frozen | Disney Frozen - Macy's Kids And Baby |
      | Hello Kitty   | Hello Kitty   | Hello Kitty - Macy's Kids And Baby   |
      | Mickey Mouse  | Mickey Mouse  | Mickey Mouse - Macy's Kids And Baby  |
      | Marvel        | Marvel        | Marvel - Macy's Kids And Baby        |



  Scenario: User should be able to search toddlers Tshirt
      When User clicks Boys sizes
      And  User clicks on Toddler Boys size
      And  User clicks on polo shirt
      Then User verify "Toddler Boys Paint Splatter Big Pony Cotton Jersey Tee" page header
