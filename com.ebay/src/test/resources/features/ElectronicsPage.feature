Feature: Ebay Electronics Page Text Links

  Background:
    Given user is on Ebay website
    When user clicks on Electronics Text link


  Scenario: Cameras Drones Text Link
    When user clicks Cameras & Photos TextLink
    And user clicks Cameras Drones Text link
    Then user should be launched on Cameras Drones page

    Scenario:
      And user clicks Car Electronics Text link
      Then user should be launched on Car Electronics page

  Scenario:
    And user clicks Treat Her Button Text link
    Then user should be launched on Treat Her Button page