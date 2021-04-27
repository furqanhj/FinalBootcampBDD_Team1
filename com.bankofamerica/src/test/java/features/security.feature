Feature: user will be accessing all the elements on deals page.

  Background:

    Given User is on the bank of america security page

    Scenario: User is able to go to lock/unlock your card page
      When User clicks on the lock and unlock your card
      And  User waits until visibility of lock and unlock your card page
      Then User should land on the lock and unlock your card page