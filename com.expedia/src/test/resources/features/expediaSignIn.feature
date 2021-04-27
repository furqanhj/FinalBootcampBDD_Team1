Feature: to check the functionalities on the sign in page

  Background:
    Given user is on the Sign In page

  Scenario:
    When user clicks on the Sign in with Google button
    Then user should be directed to the new window with Google sign in options
#
#    Scenario:
#      When user clicks on the Sign in with Apple button
#      Then user should be directed to the new window with Apple sign in options
#
#      Scenario:
#        When user clicks on the Sign in with Facebook button
#        Then user should be directed to the new window with Facebook sign in options