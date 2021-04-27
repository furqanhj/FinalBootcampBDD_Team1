Feature: Contact us Page

  Background:
    Given user is on Bank Of America website
    When user clicks on About us Text link
    And user click on Contact us Text Link

    Scenario: Dispute DebitCard Button
      When user clicks on Search Field box
      And user clicks on Billing Dispute TextLink
      And user clicks Dispute Debit Card Button
      Then user should be launched on Dispute Debit Card  page

    Scenario:  Connect with us on Facebook
      When user clicks Facebook Messenger Link
      And  user clicks Continue Btn
      Then user should be launched on Bank of America Facebook page


  Scenario Outline:  Enter Text In Search Input

    When user enters a text as "<text>"
    Then user should be able to see suggestions result

    Examples:
      |   text      |
      |   loan      |
      |   save      |
      |   financing |


