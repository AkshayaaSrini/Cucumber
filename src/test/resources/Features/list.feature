Feature: To validate the login functionality

  Scenario: To verify login functionality with valid username and invalid password in FB
    Given User has to launch chrome and hit the FB url
    When User has to enter the username and password
      | Akshu  | Srini | @678 |
      | Ganesh | Siva  | @234568 |
    And Click the login button
    Then User unable to enter the home page
