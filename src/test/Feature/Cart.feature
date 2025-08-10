@Cart
Feature: Manage products in the cart

  Scenario: User updates product quantity or removes product from cart
    Given The user clicks on the cart button
    When The user increases the product quantity
    And The user decreases the product quantity
    Then The user clicks the remove button