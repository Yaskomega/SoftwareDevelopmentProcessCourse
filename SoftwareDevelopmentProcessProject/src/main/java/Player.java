import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    // ********** VARIABLES **********
    private List<Card> hand; // Hand of the player
    private List<Card> kingdom; // Kingdom of the player

    // ********** CONSTRUCTORS **********
    public Player() {
        this.hand = new ArrayList<Card>();
        this.kingdom = new ArrayList<Card>();
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
        // We pick a random card from the hand ...
        Random random = new Random();
        if(!this.hand.isEmpty()){
            int index = random.nextInt(this.hand.size());
            Card card = this.hand.get(index);
            this.hand.remove(index);
            return card;
        }
        return null;
    }

    /**
     * Method to make the player choose a card from the kingdom
     * @return the card chosen
     */
    public Card ChooseCardFromKingdom(){
        // We pick a random card from the kingdom ...
        Random random = new Random();
        if(!this.kingdom.isEmpty()){
            int index = random.nextInt(this.kingdom.size());
            Card card = this.kingdom.get(index);
            this.kingdom.remove(index);
            return card;
        }
        return null;
    }

    /**
     * Method to know if the player has played his last card
     * @return true if he stills has card to play, else false
     */
    public boolean hasHand(){
        return !this.hand.isEmpty();
    }

    /**
     * Method to initialize a player with the correct amount of cards
     * @param game : the current game
     */
    public void Init(Game game){
        int number_of_cards = 5;
        for(int i = 0; i < number_of_cards ; i++)
            this.Draw(game.getDeck());
    }

    public String toString() {
        return "Player{}";
    }
}
