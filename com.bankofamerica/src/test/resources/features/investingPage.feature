Feature: To check the Investing Page functionality on the Bank Of America website

  Background:
    Given user is on the Investing Page

  Scenario:
    When user hovers over all the links on the header
    Then user should be able to see 6 links on the header

  Scenario:
    When user scrolls down to the video frame
    And user clicks on the Play video to learn more button
    Then the video should start playing

  Scenario:
    When user scrolls down to the video frame
    And user clicks on the Play video to learn more button
    And user hovers over the running video
    Then user should be able to see the video controls panel at the bottom

  Scenario:
    When user scrolls down to the video frame
    And user clicks on the Play video to learn more button
    And user hovers over the running video
    And user clicks on the Full Screen button
    Then the video shall be played in full screen

  Scenario Outline:
    When user enters text in Get Quote input box as "<Get Quote>"
    And user clicks on the Get Quote search button
    Then user shall see a search result body as a dropdown under Get Quote input box

    Examples:
      | Get Quote |
      | plus      |
      | life      |
      | bank      |
      | land      |
      | air       |
      | sea       |

  Scenario Outline:
    When user enters text in Search Merrill Edge input box as "<search text>"
    And user clicks on Search button in Search Merrill Edge field
    Then user shall be directed to the Search Merrill Edge search result page

    Examples:
      | search text |
      | furqan      |
      | loans       |
      | investing   |
      | 123456      |
      | final test  |
      | one last    |