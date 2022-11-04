@all
Feature: User should be able to verify the functionality title
Background:
  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box
  And User clicks wiki search button

  @WikipediaLogin
  Scenario: User should be able to see Steve Jobs page in wikipedia

    Then User sees Steve Jobs is in the wiki title

    @mainTitle
    Scenario: User should be able to see the main header
      Then User sees Steve Jobs is in the main header

  @imageHeader
      Scenario: User should be able to see the image header
        Then User sees Steve Jobs is in the image header