Feature: Bank of America HomePage features

  Background: Given User is on Bank of America HomePage

    Scenario Outline: User should be able to search for multiple items
      When User enters "<searchItems>" in search field
     Then User should see "<expectedValue>" written in search field

      Examples:
        | searchItems  | expectedValue |
        | erica        | erica         |
        | credit card  | credit card   |
        | mortgage     | mortgage      |
        | refinance    | refinance     |
        | lost card    | lost card     |
