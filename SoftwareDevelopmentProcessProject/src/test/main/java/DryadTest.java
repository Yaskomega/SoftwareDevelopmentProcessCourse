import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DryadTest {

    Dryad dryad;

    @Before
    public void setUp() throws Exception {
        dryad = new Dryad();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRace() throws Exception {
        assertTrue(dryad.getRace() == Race.DRYAD);
    }

    @Test
    public void applyPower() throws Exception {
    }

}