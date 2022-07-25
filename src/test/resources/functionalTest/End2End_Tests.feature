Feature: Automated End2End Tests
  Description: The purpose of this feature is to test End 2 End integration.
  @End2End
  Scenario Outline: Customer place an order by purchasing an item from search
    Given user is on Home Page
    When he search for "dress"
    And choose to buy the first item
    And moves to checkout from mini cart
    And enter "<customer>" personal details on checkout page
    And select same delivery address
    And select payment method as "check" payment
    And place the order
    Examples:
      | customer     |
      | Lakshay      |
      | Virender     |
      | GithubServer |
      | TryAgain     |
    @SearchFunction
    Scenario: Customer input something then search
      Given user is on Home Page
      When he click on search icon
      And he input keyword "shirt"
      And he press enter
