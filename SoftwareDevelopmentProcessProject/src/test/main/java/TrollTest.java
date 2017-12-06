package main.java;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict=true)
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
//    Troll troll;
//
//    @Before
//    public void setUp() throws Exception {
//        troll = new Troll();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    public void getRace() throws Exception {
//        assertTrue(troll.getRace() == Race.TROLL);
//    }
//
//    @Test
//    public void applyPower() throws Exception {
//    }

}
