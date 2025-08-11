@Login
Feature: Login to Trendyol website

  Scenario: Login attempt with invalid email

  Scenario Outline: It is included in the user trendyol website.
    Given The user opens the site
    When The user clicks the Login button
    And The user includes "<email>" and "<password>"
    Then The user clicks the button.

    Examples:
      | email               | password   |
      | aghayevvi@gmail.com | Agayev2211 |