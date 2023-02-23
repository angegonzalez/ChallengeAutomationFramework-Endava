Feature: Create a request token for the user
  @authentication
  Scenario: User successfully creates a request token
    Given the user has a valid API key
    When the user do the request with the API key
    Then request token is successfully created
    And field "success" is true
    And field "expires at" is a valid expiration date
  @authentication
  Scenario: User cannot create a request token
    Given the user has an invalid API key
    When the user do the request with the API key
    Then the status message is "Invalid API key: You must be granted a valid key"
    And field "success" is false
    And "status_code" is 7