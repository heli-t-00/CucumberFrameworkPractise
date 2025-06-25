Feature: Product sorting options



  Scenario: To view the filter option for the products page
    Given the standard user logged in successfully
    And on the inventory page
    When the user clicks on the sort dropdown
    Then the dropdown should display the options:
      | Name (A to Z)       |
      | Name(Z to A)        |
      | Price (low to high) |
      | Price (high to low) |