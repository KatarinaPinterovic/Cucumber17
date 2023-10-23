Feature: login

  Scenario: User can log in
    Given User is on login page
    When User inputs "tomsmith"
    And User inputs "SuperSecretPassword!"
    And User clicks on Login button
    Then User is logged in

    Scenario Outline: User cannot log in with invalid credentials
      Given User is on login page
      When User inputs <username>
      And User inputs <password>
      And User clicks on Login button
      Then User is not logged in
      Examples:
        | username | password        |
        | "user 1" | "some password" |
