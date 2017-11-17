package main.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GnomeTest {

    Gnome gnome;

    @Before
    public void setUp() throws Exception {
        gnome = new Gnome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRace() throws Exception {
        assertTrue(gnome.getRace() == Race.GNOME);
    }

    @Test
    public void applyPower() throws Exception {
    }

}