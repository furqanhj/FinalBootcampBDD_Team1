Feature: To check out the functionality of the given functions on Airbnb Homepage

  Background:
    Given user is on the airbnb homepage
    When user clicks on the more options dropdown menu

  Scenario:
    Then user should see five options in the dropdown menu

  Scenario:
    When user clicks on the signup button
    Then user should see a modal window saying "Welcome to Airbnb"

  Scenario:
    And user clicks on the signup button
    And user clicks on Continue With Facebook button
    Then user should be directed to a new window with Facebook Log in options

  Scenario:
    When user clicks on the signup button
    And user clicks on the Continue With Google button
    Then user should be directed to a new window with the header as "Sign in with Google"

  Scenario:
    When user clicks on the signup button
    And user clicks on the Continue With Apple button
    Then user should be directed to the new window with the text as "Use your Apple ID to sign in to Airbnb."

  Scenario Outline:
    When user clicks on the signup button
    And user enters invalid phone number as "<Invalid Phone Number>"
    And user clicks on the continue button in the modal window
    Then user should see the following text "You'll need to use a different phone number, we can't support this one."

    Examples:
    | Invalid Phone Number  |
    | 123124                |
    | 456789                |
    | 9876543               |
    | 5552257               |
    | 1251664               |