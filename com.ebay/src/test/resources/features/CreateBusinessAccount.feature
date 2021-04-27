Feature: Create a Business  account

  Background:
    Given user is on Ebay website
    When user clicks on Register Text link
    When user selects Business account radio button


  Scenario Outline: User should be able to create a business account

    And user enters business name as "<BusinessNames>"
    When user enters business email as "<BusinessEmails>"
    When user enters password as "<Passwords>"
    Then Create Button Should be activated


    Examples:
      | BusinessNames      | BusinessEmails      | Passwords   |
      | Kimo_Entertainment | kimo@gmail.com      | ABCD@1234   |
      | DjKimo Event       | Djkimo@gmail.com    | ABCD@4321   |
      | Morjana Bridle     | Morjana@gmail.com   | ACBD@1234   |
      | NINA SALON         | NINA@gmail.com      | ADBC@4321   |
      | GIGI Catering      | GIGI@gmail.com      | ADBC@4321   |

