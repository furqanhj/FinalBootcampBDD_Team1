Feature: users must be able to Sign in or Register on Verizon Website

  Background:
    Given user is on Verizon  website
    When user clicks sign In Button

  Scenario Outline: User can  Sign in
    And user enters user ID as "<userID>"
    When user enters password as "<userPassword>"
    Then sign in button is activated

    Examples:
    | userID   |userPassword |
    |kimo2020  |Abcd@1234|
    |DjkimoDC  |Abdc@1234|
    |Karim34   |Dbac@4321|

 Scenario: User can Register
   When user click Register Link
   And user selects In Home Radio Button
   And user clicks on Continue Button
   Then user should be launched on Register My Account Page

   Scenario:  verify  Identity page
     When user click Register Link
     And user selects In Home Radio Button
     And user clicks on Continue Button
     When user selects Registration Method Options
     Then The Option selected should be displayed

