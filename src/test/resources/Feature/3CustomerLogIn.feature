Feature: CustomerLogIn
  Scenario Outline: Customer Login
    Given Customer Can Log in now
    When Enter Customer LogIn Tab and Select Customer and Log in
    And Deposit some '<amount>'
    And Withdraw some '<amounts>'
    And Check Transactions
    Then Logout
    Examples:
    |amount|amounts|
    |5000  |4000   |

