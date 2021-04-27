Feature: to check the functionality on the Login Page

  Background:
    Given user is on the Login page

  Scenario:
    When user clicks on the Log in with Facebook button
    Then user should go to a new window and see the facebook log in options

  Scenario:
    When user clicks on the Sign in with Google button
    Then user should go to a new window and see the Google sign in options

  Scenario:
    When user clicks on Forgot Your Password link
    Then user should be directed to the Password Retrieve Page

  Scenario:
    When user clicks on Dont Have An Account Yet link
    Then user should be directed to the Register Page

    Scenario Outline:
      When user enters invalid email as "<email>"
      And user enters invalid password as "<password>"
      And user clicks on the Log in button
      Then user should see an error message as "Sorry, either your email address and/or password was not found.  Please try again."

      Examples:
      | email      | password  |
      | pehlitry   | abcd12345 |
      | doosritry  | ADASA!@#! |
      |!@#!@#      | aasda12312|
      | oasj123!!  | lkask214  |
      | professor  | as123asd1 |
      | SamiSheikh | Test123!  |
