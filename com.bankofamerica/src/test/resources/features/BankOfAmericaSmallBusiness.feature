Feature: To check functionality of Small Business page

  Background:

    Given user is on the small business page

  Scenario Outline:

    When user enters text in the search box as "<text>"
    And user clicks on the search button
    Then user should see search results dropdown with "<result>"

    Examples:

      | text              | result            |
      | bill pay          | bill pay          |
      | credit cards      | credit cards      |
      | debit cards       | debit cards       |
      | routing number    | routing number    |
      | account number    | account number    |
      | address change    | address change    |
      | investing         | investing         |
      | business services | business services |
      | help              | help              |
      | lending           | lending           |
