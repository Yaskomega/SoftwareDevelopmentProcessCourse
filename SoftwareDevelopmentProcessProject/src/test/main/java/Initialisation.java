import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Initialisation {

    private Game game;

    @Given("^a game setter for initialisation$")
    public void create_game() throws Throwable {
        game = new Game();
    }

    @When("^program starts for initialisation$")
    public void init_game() throws Throwable {
        game.Init();
    }

    @Then("^a deck is created$")
    public void check_deck() throws Throwable {
        Assert.assertEquals(20, game.getDeck().size());
    }
}
