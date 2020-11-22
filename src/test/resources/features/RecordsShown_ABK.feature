Feature: Records
  Agile story: I should be able to choose any number of records

  Background: User should be able to login with valid credentials
    Given User is on the login page
    When User logs in with email and password

  @records @ABK
  Scenario Outline: User able to choose number of records
    Then User see number of "<records>"
    Then "<actual>" numbers the same as "<expected>"


    Examples: User should see below numbers of records
      | records | actual | expected |
      | 5       | 5      | 5        |
      | 10      | 10     | 10       |
      | 15      | 15     | 15       |
      | 50      | 50     | 50       |
      | 200     | 200    | 200      |