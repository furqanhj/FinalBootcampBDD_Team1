Feature: Validating Sign In using invalid userName and password

  Background:
    Given user is on Chase Bank website
    When user clicks on Mortgage Home Loans Icon link

    Scenario Outline: User can  Sign in
      And user clicks Sign in first Button
      And user enters userName as "<userName>"
      When user enters password as "<userPassword>"
      And user clicks Sign in second button
      Then user should get an error message

      Examples:
        | userName    |userPassword  |
        | kimo2020    | Abcd@1234    |
        | DjkimoDC    | Abdc@1234    |
        | Karim34     | Dbac@4321    |
