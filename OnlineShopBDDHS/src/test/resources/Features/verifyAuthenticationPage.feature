Feature: Online Shopping Portal

  Scenario: To verify User is on Authentication Page
    Given user is on OnlineShoppingSite
    When user added the Item in cart
    Then verify user is on Authentication page