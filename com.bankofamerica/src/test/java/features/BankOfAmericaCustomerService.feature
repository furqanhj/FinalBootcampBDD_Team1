Feature: To check the search functionality of the Customer Service page

  Background:

    Given User is on the Customer Service Page

  Scenario Outline:

    When User enters text in the search field as "<searchItems>"
    And User waits until text is visible in the search field
    Then User is able to view "<expectedValue>" in the search field


    Examples:

      | searchItems        | expectedValue      |
      | Credit Card        | Credit Card        |
      | Vehicle loan       | Vehicle loan       |
      | Home loan payments | Home loan payments |
      | Bill Payments      | Bill Payments      |
      | Routing number     | Routing number     |
      | Mortgage rates     | Mortgage rates     |






