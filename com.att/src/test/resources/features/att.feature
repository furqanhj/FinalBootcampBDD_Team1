Feature: user must be able to navigate Att Internet page

  Background:
    Given user is on Att website

  Scenario: User launches "Att Internet Page"
    When user clicks on internet Text link
    Then user should be launched on result page

    Scenario: User clicks Account Text Link
      When  User clicks Account TextLink
      Then User should see options to select

      Scenario: User clicks Check Availability Button
        When User clicks Check Availability Button
        Then User should see a Check for service Tab window

  Scenario Outline:
    When user enters address in input box as "<serviceCheck>"
    And user clicks on Check Availability Button
    Then user should be able to see the  result if the Service Available

    Examples:
      |   serviceCheck                          |
      | 1200 E Longview Dr Woodbridge VA 22191  |
      | 12498 Skipper Cir Woodbridge VA 22192   |

