import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrollTest {

    private Troll troll;
    private boolean success;

    @Given("^my service exists$")
    public void my_service_exists() throws Throwable {

    }

    @When("^I call my service$")
    public void i_call_my_service() throws Throwable {
        troll = new Troll();
    }

    @Then("^it should have been a success$")
    public void it_should_have_been_a_success() throws Throwable {
        Assert.assertTrue(troll.getRace() == Race.TROLL);
    }
}
