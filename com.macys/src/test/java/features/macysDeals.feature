Feature: Macy's Deals features
 #run tests here

  Background:
    Given User is on Macy's Deals page


  Scenario Outline: User should be able to search for multiple items
    When User enters "<searchItems>" in search field
    And User should see "<expectedValue>" written in search field
    Then User should see "<pageTitle>" as current title


    Examples:
      | searchItems    | expectedValue  | pageTitle                                        |
      | Shoes          | Shoes          | Macy's Coupons, Deals and Promotions - SAVE NOW! |
      | Blazers        | Blazers        | Macy's Coupons, Deals and Promotions - SAVE NOW! |
      | Summer dresses | Summer dresses | Macy's Coupons, Deals and Promotions - SAVE NOW! |
      | Socks          | Socks          | Macy's Coupons, Deals and Promotions - SAVE NOW! |
      | Kids swimwear  | Kids swimwear  | Macy's Coupons, Deals and Promotions - SAVE NOW! |


