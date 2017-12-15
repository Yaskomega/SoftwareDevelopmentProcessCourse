import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Initialisation {

    private Game game;

    @Given("^a game setter for initialisation$")
    public void my_service_exists() throws Throwable {
        game = new Game();
    }

    @When("^program starts for initialisation$")
    public void i_call_my_service() throws Throwable {
        game.Init();
    }

    @Then("^a deck is created$")
    public void it_should_have_been_a_success() throws Throwable {
        Assert.assertEquals(20, game.getDeck().size());
    }
}
