Feature: Macys Wedding Registry Features

  Background:

    Given User is on the Macys Wedding Registry Page

  Scenario Outline: User should be able to search for multiple items
    When User enters "<searchItems>" in search field
    And User should see "<expectedValue>" written in search field
    Then User should see "<pageTitle>" as title


    Examples:
      | searchItems      | expectedValue    | pageTitle                          |
      | Corningware      | corningware      | Corningware - Macy's Registry      |
      | Bedding set      | Bedding set      | Bedding set - Macy's Registry      |
      | Kitchenaid mixer | kitchenaid mixer | Kitchenaid Mixer - Macy's Registry |
      | Vacuum           | vacuum           | Vacuum - Macy's Registry           |
      | Glass bowls      | glass bowls      | Glass bowls - Macy's Registry      |


      Scenario:
        When User clicks on Dream Fund Button
        Then User should see Dream Fund Image on the Wedding Registry page