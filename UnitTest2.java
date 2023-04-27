

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class UnitTest2.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UnitTest2
{
    private ClockTime clockTim1;
    private ClockTime clockTim2;

    /**
     * Default constructor for test class UnitTest2
     */
    public UnitTest2()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        clockTim1 = new ClockTime(5, 10, 15);
        clockTim2 = new ClockTime(11, 0, 0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
