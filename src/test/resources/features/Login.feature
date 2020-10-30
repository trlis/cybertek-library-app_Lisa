@login
Feature:Login
  Agile Story: As I user, I should be able to login

  @librarian
  Scenario: Librarian login scenario

    Given User is on the login page
    When User logs in as a librarian
    Then dashboard should be displayed