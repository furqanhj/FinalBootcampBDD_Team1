Feature: user must be able to navigate Why Host on Airbnb

  Background:
    Given user is on airbnb website
    When user clicks Become Host Button


  Scenario: User can play the Video
    And user clicks Why Host on Airbnb Picture Link
    When user clicks play video Button
    Then video should be playing