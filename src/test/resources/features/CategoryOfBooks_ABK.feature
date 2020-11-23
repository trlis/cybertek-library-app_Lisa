Feature: Book Categories
  Agile story: I should be able to choose any book categories

  Background: User should be able to login with valid credentials
    Given User is on the login page
    When User logs in with email and password

  @categories @ABK
  Scenario Outline: User able to choose book categories
    Then User choose categories of "<booksCategories>"



    Examples: User should see below booksCategories
      | booksCategories      |
      | Action and Adventure |
      | Classic              |
      | Drama                |
      | Fantasy              |
      | Romance              |