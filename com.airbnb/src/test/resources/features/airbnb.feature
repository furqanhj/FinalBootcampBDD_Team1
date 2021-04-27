Feature: user must be able to navigate Become Host page

  Background:
    Given user is on airbnb website
    When user clicks Become Host Button

  Scenario: User clicks Become Host Page button
      When user clicks get Started Button
    Then user should be launched on result page

  Scenario Outline: User should be able to sign up


    When user enters emails as "<emails>"
    When user enters phone numbers as "<phoneNumbers>"
    Then user unchecks the check box



    Examples:
      | emails             | phoneNumbers   |
      | Kimo_Entertainment | 703-618-7589   |
      | DjKimo Event       | 202-636-9687   |
      | Morjana Bridle     | 703-698-2589   |










