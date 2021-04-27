Feature: Build Your own 430i Convertible Design

  Background:
    Given user is on BMW website
    When user clicks on Build Your Own Text link
    And user clicks SeriesX5 TextLink
    And user clicks Series Convertible Select Button

    Scenario: Click Design Button
      When user clicks Design Button
      Then user should be launched on Choose Exterior Designs and Trims page

  Scenario Outline: Find Location
     When user enters his Zip Code as <numbers>
    Then user should be launched on the zip code location

    Examples:
      | numbers|
      | 22192  |
      | 22303  |

    Scenario: Chose Jet Black Color
    When user clicks Next Color Button
    And user clicks  Jet Black Color Button
      Then user should see the car Color changed to Jet Black
