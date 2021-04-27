Feature: User click Our Company Options TextLink

  Background:
    Given user is on Bank Of America website
    When user clicks on About us Text link
    And  user hovers on Our Company TextLink

    Scenario:
      And  user clicks on Responsible Growth TextLink
      Then user should be launched on result page

      Scenario:
        And  user clicks on Business Practice TextLink
        Then user should be launched on Business Practice page

        Scenario:
          And  user clicks What We Offer TextLink
          Then user should be launched on What We Offer page

