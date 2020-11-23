Feature: Login
  Agile story: As a user, I should be able/not able to valid login/ invalid login

  @loginValid @ABK
  Scenario Outline: User should be able to login with valid credentials
    Given User is on the login page
    When User logs in with "<email>" and "<password>"
    Then "<title>" should be displayed

    Examples:User fills out email and password from the table below:
      | email               | password | title     |
      | librarian59@library | whWTPjtn | dashboard |
      | student63@library   | Jg2orVoF | book      |
      | student64@library   | pbdQAvkN | book      |


  @loginInvalid @ABK
  Scenario Outline: User should not be able to login with invalid credentials
    Given User is on the login page
    When User enter "<invalidEmail>" and "<invalidPassword>"
    Then "<error>" will be displayed

    Examples:User fills out email and password from the table below:
      | invalidEmail       | invalidPassword | error                          |
      | libraran59@library | whTPjtn         | Sorry, Wrong Email or Password |
      | studet63@library   | Jg2orVo         | Sorry, Wrong Email or Password |