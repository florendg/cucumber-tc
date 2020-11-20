Feature: Demonstrate Cucumber can work with testcontainers
  Scenario: Start Selenium Container and check if we can reach a site.
    Given the Selenium container is started
    When I go to the Google home page
    Then The title of the page should be Google