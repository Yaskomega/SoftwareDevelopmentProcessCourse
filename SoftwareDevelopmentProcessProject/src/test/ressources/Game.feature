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
    Given A player
    And the deck is not empty
    When it is his turn to draw a card
    Then He can draw a card

  Scenario: Play one card
    Given A player
    When it is his turn to play
    And he has drawn
    Then he can play a card

  Scenario: Add to kingdom
    Given A player
    When he add a card to kingdom
    Then the card is added to his kingdom
#
#  Scenario: Trigeer card effect
#    Given A card
#    When it is added to a kingdom\'s player from the hand
#    Then it triggered its effect

#  Scenario: Korrigan effect
#    Given A Korrigan card
#    When it is added to a kingdom from the hand
#    Then the player draw two cards in his opponent hand
#
#  Scenario: Gnome effect
#    Given A Gnome card
#    When it is added to a kingdom from the hand
#    Then the player draw two card in the deck
#
#  Scenario: Elf effect
#    Given An Elf card
#    When it is added to a kingdom from the hand
#    Then the player copy
#    And play the power of a card of the ennemy s kingdom
#
#  Scenario: Dryad effect
#    Given A Dryad card
#    When it is added to a kingdom from the hand
#    Then the player steal a card from the opponent s kingdom to add it to his
#
#  Scenario: Troll effect
#    Given A Troll card
#    When it is added to a kingdom from the hand
#    Then the two kingdoms are swapped

#  Scenario: End game
#    Given A Game checker
#    When both player\'s hand
#    And the deck are empty
#    Then the game is finished

#  Scenario: End player
#    Given A Game checker
#    When the deck is empty
#    And a player hand s is empty
#    Then his turn is passed

