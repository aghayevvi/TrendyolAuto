@Login
Feature: Login to Trendyol website

  Scenario: Login attempt with invalid email

  Scenario Outline: It is included in the user trendyol website.
    Given User opens the site
    When the user clicks the Login button
    And User includes "<email>" and "<password>"
    Then The user clicks the button.

    Examples:
      | email               | password   |
      | aghayevvi@gmail.com | Agayev2211 |