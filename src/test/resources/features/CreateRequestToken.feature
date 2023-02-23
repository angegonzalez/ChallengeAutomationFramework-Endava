Feature: Create a request token for the user
  Scenario: Users successfully create a request token
    Given the user has a valid API key
    When the user do the request with the API key
    Then request token is successfully created and it's returned back to the user
    And additional fields like "success" and "expires at" are returned too