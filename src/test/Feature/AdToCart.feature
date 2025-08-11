@AdToCart
Feature: Add product to cart

  Scenario: User clicks on a product, selects size, and adds it to the cart
    Given The user scrolls down the page
    When The user clicks on a product
    And The user should be switched to the new tab
    And The user selects size
    Then The user clicks the Sepete Ekle button
