Feature: Features of the game

  Scenario: Initialisation
    Given a game setter for initialisation
    When program starts for initialisation
    Then a deck is created

  Scenario: Distribution
    Given a game setter for distribution
    When program starts for distribution
    Then both players got 5 cards in their hand

  Scenario: Draw one card
    Given A player playing
    And the deck is not empty
    When it is his turn to draw a card
    Then He can draw a card

  Scenario: Play one card
    Given A player playing a card
    When it is his turn to play
    And he has drawn
    Then he can play a card

#  Scenario: Add to kingdom
#    Given A player trying to add a card to kingdom
#    When he has played a card
#    Then the card is added to his kingdom


  Scenario: Some scenario
    Given my service exists
    When I call my service
    Then it should have been a success
