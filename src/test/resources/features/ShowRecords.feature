Feature: As a user i should be able to verify links of records
    @wip
    Scenario: verify default values in Users page
    Given I am on the login page
    And I login as a librarian
    When I click on "Users" link
    Then show records default value should be 10
    And show records should have following options:
         | 5   |
         | 10  |
         | 15  |
         | 50  |
         | 100 |
         | 200 |
         | 500 |