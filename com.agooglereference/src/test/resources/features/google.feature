Feature: user must be able to search for an item by entering text in the search bar and clicking on the Google Search button

  Background:
    Given user is on the google homepage

  Scenario Outline:
    When user enters a text as "<text>"
    And user clicks on the Google Search button
    Then user should be able to see the search result page

    Examples:
    |   text                      |
    | samsung watch 3             |
#    | wireless charging stations  |
#    | travel bags                 |