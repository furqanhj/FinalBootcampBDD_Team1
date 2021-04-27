Feature: To validate functionality on WWE Homepage

  Background:
    Given user is on WWE Homepage

  Scenario:
    Then user should be able to see 9 links on the header

  Scenario:
    When user clicks on the Wrestle Mania link
    Then user shall be directed to the Wrestle Mania page

  Scenario:
    When user clicks on the Tickets link
    Then user shall be directed to the Vividseats.com page in a new window

  Scenario:
    When user clicks on the Title Watch link
    Then user shall be directed to the Title Watch page

  Scenario: user should navigate to AJ Styles profile page and validate via AJ styles Image displayed.
    When user clicks on Wrestler profiles link
    And user clicks on AJ Styles profile link
    Then user shall be directed to AJ Styles profile page and AJ Styles image should be displayed