

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RobotTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RobotTest
{
    /**
     * Default constructor for test class RobotTest
     */
    public RobotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void only_test()
    {
        Robot robot1 = new Robot();
        robot1.setSpeed(30.0);
        robot1.setSignal("green");
        assertEquals(30.0, robot1.getSpeed(), 0);
        assertEquals(30.0, robot1.getSpeed(), 0);
        assertEquals("green", robot1.getSignal());
        assertEquals(30.0, robot1.RobotWalk("green", 30.0), 0);
    }
}

