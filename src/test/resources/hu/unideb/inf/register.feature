Feature: User registration

  Scenario: Try registration with empty fields
    Given I'm on the registration page
    And I submit the form
    Then I should see a registration first step again

  Scenario: Successful user registration
    Given I'm on the registration page
    When I fill in the registration form with valid data
    And I submit the form
    Then I should see a registration first step success