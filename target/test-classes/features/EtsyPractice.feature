@etsy
Feature: Etsy Title Verification


Background:
    Given User is on etsy home page

  Scenario: User should be able to see Etsy
    When User sees title is as expected

  Scenario: Etsy Search Functionality Title Verification without parameterization
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification with parameterization
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden spoon" is in the title


