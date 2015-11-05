package example.classone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Netsteller
 */
public class HellowTest {

    public HellowTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of sayYourName method, of class Hellow.
     */
    @Test
    public void testSayYourName() {
        System.out.println("sayYourName");
        String result = Hellow.sayYourName();
        assertEquals("This is class one.", result);
    }

}