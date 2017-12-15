import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Distribution {

    private Game game;

    @Given("^a game setter for distribution$")
    public void my_service_exists() throws Throwable {
        game = new Game();
    }

    @When("^program starts for distribution$")
    public void i_call_my_service() throws Throwable {
        game.Init();
    }

    @Then("^both players got 5 cards in their hand$")
    public void it_should_have_been_a_success() throws Throwable {
        Assert.assertEquals(5, game.getPlayer1().getHand().size());
        Assert.assertEquals(5, game.getPlayer2().getHand().size());
    }
}
