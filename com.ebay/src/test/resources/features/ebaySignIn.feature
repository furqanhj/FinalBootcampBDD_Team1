Feature: user is on sign in page and enters invalid username and invalid password and should not be able to login

  Background:
    Given user is on sign in page

#  Scenario:
#    When user enters text in email input field
#    And user clicks on the continue button
#    Then user shall be directed to the password input page
#
#  Scenario:
#    When user clicks on the Create An Account link on sign up page
#    Then user shall be directed to Create An Account page

  Scenario Outline:
    When user clicks on the Create An Account link on sign up page
    And user enters first name as "<First Name>"
    And user enters last name as "<Last Name>"
    And user enters email as "<Email>"
    And user enters password as "<Password>" and verifies his password
    And user clicks on Create Account button
    Then user shall see "<expected text>" on homepage

    Examples:
    | First Name  | Last Name | Email                 | Password        | expected text  |
    | pehla       | naam      | pehlanaam@gmail.com   | Paan1234!!      | Hi pehla!      |
#    | doosra      | naam      | doosranaam@gmail.com  | Daan1234!!      | Hi doosra!     |
#    | teesra      | naam      | teesranaam@gmail.com  | Taan1234!!      | Hi teesra!     |
#    | chotha      | naam      | chothanaam@gmail.com  | Chaan1234!!     | Hi chotha!     |
#    | panchwa     | naam      | panchwa@gmail.com     | Pehchaan1234!!  | Hi panchwa!    |

#  Scenario:
#    When user clicks on Continue With Facebook button
#    Then user shall be directed to Log into facebook page
#
#  Scenario:
#    When user clicks on Continue With Google button
#    Then user shall be directed to Log into Google new window
#
#  Scenario:
#    When user clicks on Continue With Apple button
#    Then user shall be directed to Log in with Apple ID page