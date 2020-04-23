

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
<<<<<<< HEAD

    @Test
    public void StatementCoveragePath1()
    {
        Robot robot1 = new Robot();
        assertEquals(36.0, robot1.RobotWalk("yellow", 30.0), 0);
    }

    @Test
    public void StatementCoveragePath2()
    {
        Robot robot2 = new Robot();
        assertEquals(0.0, robot2.RobotWalk("red", 30.0), 0);
    }

    @Test
    public void DecisionCoveragePath1()
    {
        Robot robot3 = new Robot();
        assertEquals(30.0, robot3.RobotWalk("green", 30.0), 0);
    }

    @Test
    public void DecisionCoveragePath2()
    {
        Robot robot4 = new Robot();
        assertEquals(36.0, robot4.RobotWalk("yellow", 30.0), 0);
    }

    @Test
    public void DecisionCoveragePath3()
    {
        Robot robot5 = new Robot();
        assertEquals(0.0, robot5.RobotWalk("red", 30.0), 0);
    }
}





=======
}
>>>>>>> 02e88c57686a15936b744cc14581399d38dbc277
