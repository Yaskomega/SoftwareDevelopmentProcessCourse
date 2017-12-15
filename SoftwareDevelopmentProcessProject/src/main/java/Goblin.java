import java.util.List;

public class Goblin extends Card {
    // ********** VARIABLES **********

    // ********** CONSTRUCTORS **********

    // ********** GETTERS **********

    // ********** SETTERS **********

    // ********** METHODS **********
    public void ApplyPower(Game game, Player player)
    {
        //switch your hand with you opponent
        List<Card> buffer = game.getPlayer1().getHand();
        game.getPlayer1().setHand(game.getPlayer2().getHand());
        game.getPlayer2().setHand(buffer);
    }
    public Race getRace()
    {
        return Race.GOBLIN;
    }
}
