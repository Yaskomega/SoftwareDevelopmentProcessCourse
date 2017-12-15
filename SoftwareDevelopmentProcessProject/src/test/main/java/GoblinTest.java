import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoblinTest {

    Goblin goblin;

    @Before
    public void setUp() throws Exception {
        goblin = new Goblin();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRace() throws Exception {
        assertTrue(goblin.getRace() == Race.GOBLIN);
    }

    @Test
    public void applyPower() throws Exception {
    }

}