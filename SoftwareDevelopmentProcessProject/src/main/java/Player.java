package main.java;

import java.util.List;
import java.util.Random;

public class Player {
    // ********** VARIABLES **********
    private List<Card> hand; // Hand of the player
    private List<Card> kingdom; // Kingdom of the player

    // ********** CONSTRUCTORS **********
    public Player() {
    }

    // ********** GETTERS **********
    public List<Card> getHand() {
        return hand;
    }

    public List<Card> getKingdom() {
        return kingdom;
    }
    // ********** SETTERS **********
    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void setKingdom(List<Card> kingdom) {
        this.kingdom = kingdom;
    }

    // ********** METHODS **********
    public void Draw(List<Card> deck){
        // We pick a random card from the deck ...
        Random random = new Random();
        if(!deck.isEmpty()){
            int index = random.nextInt(deck.size());
            Card card = deck.remove(index);
            // ... then we add it to the hand
            this.AddCardToHand(card);
        }
    }

    public void Play(Game game){
        // TO BE COMPLETED ...
        //Draw a card
        this.Draw(game.getDeck());
        // Choose a card from hand
        Card card = this.ChooseCardFromHand();
        // Add it to the kingdom
        this.AddCardToKingdom(card);
        // Apply the power
        this.UseCard(game,card);
    }

    /**
     * Method to apply the power of a card
     * @param game the current game
     * @param card the card to be used
     */
    public void UseCard(Game game, Card card){
        card.ApplyPower(game, this);
    }

    /**
     * Method to add a card to the kingdom
     * @param card the card to be added
     */
    public void AddCardToKingdom(Card card){
        this.kingdom.add(card);
    }

    /**
     * Method to add a card to the hand
     * @param card the card to be added
     */
    public void AddCardToHand(Card card){
        this.hand.add(card);
    }

    /**
     * Method to make the player choose a card from the hand
     * @return the card chosen
     */
    public Card ChooseCardFromHand(){
        // TO BE COMPLETED ...
        return null;
    }

    public String toString() {
        return "Player{}";
    }
}
