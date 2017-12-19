public class Elf extends Card {
    // ********** VARIABLES **********

    // ********** CONSTRUCTORS **********

    // ********** GETTERS **********

    // ********** SETTERS **********

    // ********** METHODS **********
    public void ApplyPower(Game game, Player player)
    {
        //copy and use the power of one of the card in front of you
        game.getPlayer1().AddCardToHand(game.getPlayer2().ChooseCardFromHand());
        game.getPlayer1().ChooseCardFromHand().ApplyPower(game, player);
    }
    public Race getRace()
    {
        return Race.ELF;
    }
}