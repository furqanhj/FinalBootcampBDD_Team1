Feature: User is accessing features on Macys home page

  Background:
    Given User is on homepage

    Scenario:
      When User clicks on Deals Link
      Then User should land on the deals page
#    *****************************************************************************************