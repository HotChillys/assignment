@wip
Feature: User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons

  Background: User logged in as truck driver
    Given User is on vytrack login page
    When User enters username "user3"
    And User enters password "UserUser123"
    And User clicks on Login button
    And User hover over to Fleet module and click on Vehicles

  Scenario: User should be able to click Export Grid dropdown
    Then User should be able to click Export Grid dropdown

  Scenario:
    Then Export Grid dropdown is on the left of the page

  Scenario: User should be able to click refresh button
    Then User should be able to refresh button

  Scenario: User should be able click reset button
    Then User should be able click reset button

  Scenario: User should be able to click Grid Settings button
    Then User should be able to click Grid Settings button

  Scenario: Refresh button should be on the left side of Reset button
    Then Refresh button should be on the left side of Reset button

  Scenario: Grid Settings should be on the right side of the Reset button
    Then Grid Settings should be on the right side of the Reset button

  Scenario: Grid Setting button is on the right of the page
    Then Grid Setting button is on the right of the page