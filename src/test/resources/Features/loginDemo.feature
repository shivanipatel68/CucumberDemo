Feature:  Test Login functionality

  Scenario: Check login is sucessful with valid credentials
    Given browser is open
    And user is on Login Page
    When user inputs valid username and password
    And user clicks on login button
    Then user is redirected to the home page