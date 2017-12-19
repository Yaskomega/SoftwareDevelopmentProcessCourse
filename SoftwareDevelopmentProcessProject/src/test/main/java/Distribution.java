import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Distribution {

    private Game game;

    @Given("^a game setter for distribution$")
    public void create_game() throws Throwable {
        game = new Game();
    }

    @When("^program starts for distribution$")
    public void init_game() throws Throwable {
        game.Init();
    }

    @Then("^both players got 5 cards in their hand$")
    public void check_players_hands() throws Throwable {
        Assert.assertEquals(5, game.getPlayer1().getHand().size());
        Assert.assertEquals(5, game.getPlayer2().getHand().size());
    }
}
