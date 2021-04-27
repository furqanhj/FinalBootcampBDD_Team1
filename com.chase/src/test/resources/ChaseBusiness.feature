Feature: Chase Business Features

  Background:

    Given User is on the Chase Business page

    Scenario:
    When User clicks on Learn More Button under PPP loan update
    Then User should see "We are accepting PPP applications" header

    Scenario:
      When User clicks on the bonus points Learn More button
      Then User should see bonus points text on the page

    Scenario:
      When User clicks on the Women on the move Learn More Button
      Then User should be directed to Women on the move page with image "Women On The Move"
