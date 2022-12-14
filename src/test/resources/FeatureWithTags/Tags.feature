Feature: Check Home Page Functionality

  @smoke
  Scenario: Check Logout link
    Given user is logged In
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  @regression @smoke
  Scenario: Sample2
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page
