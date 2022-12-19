@wip
Feature: Purchase E2E test

  Background:
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce" credentinal

    Scenario: Sauce Purchase
      When The user should be able to sort the product "Price (high to low)"
      And The user should be choose cheapest and costliest products
      And The user should open the basket
      And The user should make checkout
      And The user should input "efecik" and "poncu" and "7103"
      And The user should finish
      Then The user should verify Checkout: Complete!



