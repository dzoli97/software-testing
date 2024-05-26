Feature: User registration

  Scenario: Successful user registration
    Given I am on the registration page
    When I fill in the registration form with valid data
    And I submit the form
    Then I should see a registration first step success
