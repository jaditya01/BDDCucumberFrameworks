Feature: Validate the API Service of ReqRes

  Scenario Outline: Validate GET request on ReqRes
    Given GET Request with list of user
    When User Request user from "<page>"
    Then Response should be "<Status code>"
    Examples:
      | page| Status code     |
      | 2   | 200             |


  Scenario Outline: Validate a Single User in GET Request
    Given a Single User with "<id>"
    When  user request user details
    Then  Response should be display "<Status Code>"
    And   User "<First Name>" should match
    Examples:
    |id|First Name|Status Code|
    |2 |Janet     |200        |

