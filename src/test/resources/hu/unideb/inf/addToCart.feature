Feature: Add to cart
  Scenario: Go to products and add one element to cart
    Given I'm on the products page
    And First element add to cart
    Then Check modal is opened