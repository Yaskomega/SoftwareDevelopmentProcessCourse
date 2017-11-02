package main.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrollTest {

    Troll troll;

    @Before
    public void setUp() throws Exception {
        troll = new Troll();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRace() throws Exception {
        assertTrue(troll.getRace() == Race.TROLL);
    }

    @Test
    public void applyPower() throws Exception {
    }

}
