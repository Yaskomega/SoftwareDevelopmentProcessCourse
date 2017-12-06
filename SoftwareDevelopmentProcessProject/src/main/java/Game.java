package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    // ********** VARIABLES **********
    private Player player1; // Player number 1
    private Player player2; // Player number 2
    private List<Card> deck; // The decks composed of cards to be drown

    // ********** CONSTRUCTORS **********
    public Game() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.deck = new ArrayList<Card>();
    }

    // ********** GETTERS **********
    public Player getPlayer1(){ return this.player1; }

    public Player getPlayer2(){ return this.player2; }

    public List<Card> getDeck() {
        return deck;
    }

    // ********** SETTERS **********
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
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
        return !this.player1.hasHand() || !this.player2.hasHand() ;
    }

    /**
     * Method to launch the game
     */
    public void Launch(){
        while(!this.GameOver()){
            player1.Play(this);
            player2.Play(this);
        }
    }

    /**
     * Method to initialize the game
     */
    public void Init(){

        // Building the deck :
        Random random = new Random();
        for(int i=0; i<10; i++)
        {
            int index = random.nextInt(6);
            if (index == 0) {
                Korrigan card = new Korrigan();
                this.deck.add(card);
            }
            if (index == 1) {
                Gnome card = new Gnome();
                this.deck.add(card);
            }
            if (index == 2) {
                Goblin card = new Goblin();
                this.deck.add(card);
            }
            if (index == 3) {
                Elf card = new Elf();
                this.deck.add(card);
            }
            if (index == 4) {
                Dryad card = new Dryad();
                this.deck.add(card);
            }
            if (index == 5) {
                Troll card = new Troll();
                this.deck.add(card);
            }
        }

        //print the deck to test the building of the deck
//        System.out.print(this.deck.size());
//        System.out.print(this.deck);

        // Each player draw 5 cards :
        this.player1.Init(this);
        this.player2.Init(this);

        System.out.print(this.player1.getHand());
    }

    public String toString() {
        return "Game{}";
    }
}
