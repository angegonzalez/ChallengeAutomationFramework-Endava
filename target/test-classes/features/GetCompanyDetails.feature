Feature: Get company details
  @companies
  Scenario: User successfully gets company details
    Given the user has a valid API key
    And the user has the company id "valid company id"
    When the user do the request
    Then company details are not null
    And field "company_name" is "Lucasfilm"

  @companies
  Scenario: User cannot get company details due to invalid company id
    Given the user has a valid API key
    And the user has the company id "invalid company id"
    When the user do the request
    Then company details are null
    And field "status_message" is "The resource you requested could not be found"
    And field "status_code" is 34

  @companies
  Scenario: User cannot get company details due to invalid API key
    Given the user has an invalid API key
    And the user has the company id "valid company id"
    When the user do the request
    Then company details are null
    And field "status_message" is "Invalid API key: You must be granted a valid key"
    And field "status_code" is 7
    And "success" field is false