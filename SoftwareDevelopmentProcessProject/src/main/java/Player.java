package main.java;

import java.util.List;

public class Player {

    // ********** VARIABLES **********
    private List<Card> hand; // Hand of the player
    private List<Card> kingdom; // Kingdom of the player

    // ********** CONSTRUCTORS **********
    public Player() {
    }

    // ********** GETTERS **********

    // ********** SETTERS **********

    // ********** METHODS **********
    public void Draw(List<Card> deck){
        // TO BE COMPLETED ...
    }

    public void Play(Game game){
        // TO BE COMPLETED ...
    }

    public void UseCard(Card card){
        // TO BE COMPLETED ...
    }

    public void AddCardToKingdom(Card card){
        // TO BE COMPLETED ...
    }

    public Card ChooseCardFromHand(){
        // TO BE COMPLETED ...
        return null;
    }

    public String toString() {
        return "Player{}";
    }
}
