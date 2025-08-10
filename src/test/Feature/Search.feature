@Search
Feature: Product search and filtering

  Scenario: User searches for a dress and applies filters
    Given I click on the search box on the homepage
    And I click on the Büyük Beden Elbise category on the results page
    And I type LC into the brand filter search box
    And I select the LC Waikiki brand
    Then I select the XS size filter
