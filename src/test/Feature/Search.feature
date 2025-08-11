@Search
Feature: Product search and filtering

  Scenario: User searches for a dress and applies filters
    Given The user on the search box on the homepage
    And The user on the Büyük Beden Elbise category on the results page
    And The user LC into the brand filter search box
    And The user the LC Waikiki brand
    Then The user the size filter
