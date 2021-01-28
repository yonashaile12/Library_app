Feature: Login with parameters
  @librarianParam
  Scenario: Login as librarian 43
    Given I am on the login page
    When I enter username "librarian43@library"
    And I enter password 'np6AxVIh'
    And click the sign in button
    Then dashboard should be displayed
    Then dashboard should be displayed
    And there should be 2628 users



    @studentParam
  Scenario: Login as librarian 30
    Given I am on the login page
    When I enter username "student30@library"
    And I enter password 'IaT9YI0I'
    And click the sign in button
    Then books should be displayed
    #number can be whatever you have there

  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian12@library" and "AOYKYTMJ"
    Then dashboard should be displayed
    #number can be whatever you have there