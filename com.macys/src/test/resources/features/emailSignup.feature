Feature: Signup for emails functionality

  Background:
    Given user is on the Signup For Emails Page

  Scenario Outline:
    When user enters email address as "<email>"
    And user enters zip code as "<zip code>"
    And user selects a month from the dropdown as "<month>"
    And user selects a date from the dropdown "<date>"
    And user selects a year from the dropdown
    And user clicks on the Im Not A Robot Checkbox
    Then user should not be able to click the submit button, instead an error message should appear

    Examples:
    |   email               | zip code | month  | date  |
    | abc@xyz.com           | 77373    |  6     | 28    |
    | aabbcc@xyz.com        | 27565    |  7     | 25    |
    | xyz@abc.com           | 67401    |  12    | 17    |
    | xxyyzz@abc.com        | 80198    |  11    | 12    |
    | bootcamp@abc.com      | 58282    |  6     | 23    |
    | testemail@furqan.com  | 67401    |  10    | 1     |
    | aakhriemail@done.com  | 67410    |  8     | 14    |
