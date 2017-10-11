# Software Development Process Project

This year, each Team will have to code a card game.

Technic notes: the project will be coded in Java and the User Interface (UI) will be realize with the JavaFX library (using FXML for layout description and CSS for decoration)


## Rules

### Game Setup : 

Cards are shuffled. 
Each player draw 5 cards.

### How it works ?

Each card represent an individual of a race. Each race have a specific power.
When it's its turn, each player draws a card and plays a card from his/her hand in front of him/her. Then he/she applies the power of the card.
The cards in front of a player compose his/her kingdom.
Then it's the turn of the next player.

### End of the game

The game continue even if the deck is empty until one of the players plays his/her last card. Then the other player play his/her last turn. So each players have played the same number of cards during the game.
Each player receive 1 point for each individual within its kingdom. He/She also receive 3 extra point if he/she has almost one individual of each of the 6 races.

### Races

- Korrigan : draw 2 random cards within your opponent hand
- Gnome :  draw 2 cards
- Goblin: switch your hand with you opponent
- Elf : copy and use the power of one of the card in front of you
- Dryad : stole a card in front of your opponent and add it in front of you without activating its power.
- Troll: swap the cards in front of you with the cards in front of your opponent

Modifié le: dimanche 24 septembre 2017, 17:05