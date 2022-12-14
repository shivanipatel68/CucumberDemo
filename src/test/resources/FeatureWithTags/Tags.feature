Feature: Feature to demo tags

  @smoke
  Scenario: Sample1
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  @regression @smoke
  Scenario: Sample2
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page
