Feature: User registration
  Scenario: Try registration with empty fields
    Given I'm on the registration page
    And I submit the form
    Then I should see a registration first step again

  Scenario: Successful user registration first step
    When I fill in the registration form with valid data
    And I submit the form
    Then I should see a registration first step success

  Scenario: Successful user registration second step
    When I fill in the registration second form with valid data
    And I submit second form
    Then I should see a registration second step success