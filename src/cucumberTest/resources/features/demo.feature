Feature: Demonstrate Cucumber
  As a developer I would like to see If cucumber works
  Scenario Outline: Set the color to "<color>"
    Given A Bike instance is constructed
    When I set the color to "<color>"
    Then the color should be "<color>"

    Examples:
    | color |
    | Blue  |
    | Red   |
