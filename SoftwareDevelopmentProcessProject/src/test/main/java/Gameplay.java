import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Gameplay {

    private Game game;

    @Given("^A player$")
    public void init_game() throws Throwable {
        game = new Game();
        game.Init();
    }

    @And("^the deck is not empty$")
    public void check_deck() throws Throwable {
        Assert.assertFalse(game.DeckIsEmpty());
    }

    @When("^it is his turn to draw a card$")
    public void draw_card() throws Throwable {
        game.getPlayer1().Draw(game.getDeck());
    }

    @Then("^He can draw a card$")
    public void draw_card_sucess() throws Throwable {
        Assert.assertEquals(6, game.getPlayer1().getHand().size());
    }

    @When("^it is his turn to play$")
    public void check_turn() throws Throwable {
        game.getPlayer1().Play(this.game);
    }

    @And("^he has drawn$")
    public void check_drawn() throws Throwable {
        Assert.assertEquals(19, game.getDeck().size());
    }

    @Then("^he can play a card$")
    public void try_to_play() throws Throwable {
        Assert.assertEquals(7, game.getPlayer1().getHand().size());
    }

    @When("^he add a card to kingdom$")
    public void played_card() throws Throwable {
        game.getPlayer1().AddCardToKingdom(game.getPlayer1().ChooseCardFromHand());
    }

    @Then("^the card is added to his kingdom$")
    public void check_kingdom() throws Throwable {
        Assert.assertEquals(1, game.getPlayer1().getKingdom().size());
    }

//
//    @And("^the deck is not empty$")
//    public void deck_not_empty() throws Throwable {
//        Assert.assertEquals(game.DeckIsEmpty(), false);
//    }
//
//    @When("^he draw a card from the deck$")
//    public void draw_from_deck() throws Throwable {
//        player.Draw(game.getDeck());
//    }
//
//    @Then("^this card is added to his hand$")
//    public void card_add_to_hand throws Throwable {
//        Assert.assertEquals(player.getHand().size(), hand.size()+1);
//    }
//
//    @Given("^a player$")
//    public void a_player() throws Throwable {
//        //voir plus haut, je pense mÍme qu'il faille faire un stepdefs comme dans l'exemple prof
//    }
//
//    @When("^he choose a card$")
//    public void choose_a_card() throws Throwable {
//        player.ChooseCardFromHand();
//    }
//
//    @Then("^ha can play this card$")
//    public void play_card() throws Throwable {
//        Assert.assertEquals(hand.size() - 1, player.getHand().size());
//    }
//
//    @Given("^a player$")
//    public void a_player throws Throwable {
//        //comme l'autre
//    }
//
//    @When("^he has played a card$")
//    public void paly_a_card() throws Throwable {
//
//    }
//
//    @Then("^it triggered its effect$")
//    public void trigger_effect() throws Throwable {
//
//    }
//
//    @Given("^a Korrigan card$")
//    public void korrigan_card throws Throwable {
//
//    }
//
//    @When("^it is added to a kingdom's player from the hand$")
//    public void add_kingdom() throws Throwable {
//
//    }
//
//    @Then("^the player draw two cards in his opponent hand$")
//    public void korrigan_effect() throws Throwable {
//
//    }
//
//    @Given("^a Gnome Card$")
//    public void gnome_card() throws Throwable {
//
//    }
//
//    @When("^it is added to a kingdom's player from the hand$")
//    public void add_kingdom() throws Throwable {
//
//    }
//
//    @Then("^the player draw two card in the deck$")
//    public void gnome_effect() throws Throwable {
//
//    }
//
//
//
//    @Given("^an Elf card$")
//    public void elf_card() throws Throwable {
//
//    }
//
//    @When("^it is added to a kingdom's player from the hand$")
//    public void add_kingdom() throws Throwable {
//
//    }
//
//    @Then("^play the power of a card of the ennemy s kingdom$")
//    public void elf_effect() throws Throwable {
//
//    }
//
//
//
//    @Given("^a Dryad card$")
//    public void dryad_card() throws Throwable {
//
//    }
//
//    @When("^it is added to a kingdom's player from the hand$")
//    public void add_kingdom() throws Throwable {
//
//    }
//
//    @Then("^the player steal a card from the opponent s kingdom to add it to his$")
//    public void drayd_effect() throws Throwable {
//
//    }
//
//
//
//    @Given("^a Troll card$")
//    public void troll_card() throws Throwable {
//
//    }
//
//    @When("^it is added to a kingdom's player from the hand$")
//    public void add_kingdom() throws Throwable {
//
//    }
//
//    @Then("^the two kingdoms are swapped$")
//    public void troll_effect() throws Throwable {
//
//    }
//
//    @When("^both player's hand are empty$")
//    public void palyer_hand_empty() throws Throwable {
//
//    }
//
//    @And("^the deck is empty$")
//    public void deck_empty() throws Throwable{
//
//    }
//
//    @Then("^the game is finished$")
//    public void game_end() throws Throwable {
//
//    }
//
//    @Given("^a Game checker$")
//    public void game_checker() throws Throwable {
//
//    }
//
//    @When("^both player's hand are empty$")
//    public void palyer_hand_empty() throws Throwable {
//
//    }
//
//    @And("^the deck is empty$")
//    public void deck_empty() throws Throwable{
//
//    }
//
//    @Then("^his turn is passed$")
//    public void test() throws Throwable {
//
//    }
}
