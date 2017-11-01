package main.java;

import java.util.ArrayList;
import java.util.List;

public class Game {

    // ********** VARIABLES **********
    private List<Player> players; // The list of players
    private List<Card> deck; // The decks composed of cards to be drown

    // ********** CONSTRUCTORS **********
    public Game() {
        this.players = new ArrayList<Player>();
        this.deck = new ArrayList<Card>();
    }

    // ********** GETTERS **********
    public List<Player> getPlayers() {
        return players;
    }

    public List<Card> getDeck() {
        return deck;
    }

    // ********** SETTERS **********
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    // ********** METHODS **********

    /**
     * Method to know if the deck is empty or not
     * @return true if the deck is empty, else false
     */
    public boolean DeckIsEmpty(){
        return this.deck.isEmpty();
    }

    /**
     * Method to know if the game is over or not
     * @return true if the game is over, else false
     */
    public boolean GameOver(){
        for(Player player : this.players){
            if(!player.hasHand())
                return true;
        }
        return false;
    }

    /**
     * Method to launch the game
     */
    public void Launch(){
        while(!this.GameOver()){
            for (Player player : this.players) {
                if(this.GameOver())
                    break;
                player.Play(this);
            }
        }
    }

    /**
     * Method to initialize the game
     */
    public void Init(int number_of_players){
        // Adding players :
        for(int i = 0; i < number_of_players ; i++)
            this.players.add(new Player());

        // Building the deck :
        //TO BE COMPLETED ...

        // Each player draw 5 cards :
        for (Player player : this.players ) {
            player.Init(this);
        }
    }

    public String toString() {
        return "Game{}";
    }
}
