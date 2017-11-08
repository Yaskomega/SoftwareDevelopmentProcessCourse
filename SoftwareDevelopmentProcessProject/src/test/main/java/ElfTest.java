package main.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest {

    Elf elf;

    @Before
    public void setUp() throws Exception {
        elf = new Elf();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRace() throws Exception {
        assertTrue(elf.getRace() == Race.ELF);
    }

    @Test
    public void applyPower() throws Exception {
    }

}