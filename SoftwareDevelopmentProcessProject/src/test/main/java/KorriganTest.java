package main.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KorriganTest {

    Korrigan korrigan;

    @Before
    public void setUp() throws Exception {
        korrigan = new Korrigan();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRace() throws Exception {
        assertTrue(korrigan.getRace() == Race.KORRIGAN);
    }

    @Test
    public void applyPower() throws Exception {
    }

}