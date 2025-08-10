@AdToCart
Feature: Add product to cart

  Scenario: User clicks on a product, selects size S, and adds it to the cart
    Given The user scrolls down the page
    When The user clicks on a product
    And The user should be switched to the new tab
    And The user selects size S
    Then The user clicks the Sepete Ekle button
