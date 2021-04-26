Feature: To check the functionality of TV Page

  Background:
    Given user is on the TV page

  Scenario:
    When user hovers over all the links on the header of TV page
    Then user should see 7 links on the header

  Scenario:
    When user clicks on the ATT TV link
    Then user shall be directed to the ATT TV url

  Scenario:
    When user clicks on Channel Lineup link
    Then user shall be directed to the Channel Lineup page with text as "AT&T TV Channel Lineup"

  Scenario:
    When user clicks on Device & Features link
    Then user shall be directed to Device Features page with text as "Features you’ll love"

  Scenario:
    When user clicks on the Sports link
    Then user shall be directed to sports page

  Scenario:
    When user clicks on the Packages link
    Then user is shall be directed to packages page
    And user shall be able to see the table of packages

  Scenario:
    When user clicks on the Bundles link
    Then user shall be directed to the bundles page
    And user shall be able to see the Shop AT&T bundles button

  Scenario:
    When user clicks on the DirectTV link
    Then user shall land on the DirectTv page