Feature: Customer
  Scenario Outline: Customer Delete
    Given Bank Manager come here to delete the customer
    When Click on the Customer Search tab and '<search>' customer
    Then Delete the customer
    Examples:
    |search|
    |kanon |