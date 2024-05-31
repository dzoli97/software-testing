Feature: Add multiple product to cart

  Scenario: Go to products and add multiple element to cart
    Given I'm on the products page
    And Open first product details
    When I on the first product details, add this product 3x to cart
    Then Check modal is opened

  Scenario: Check item number from cart
    Given I'm on the cart page
    And Check number of products in cart