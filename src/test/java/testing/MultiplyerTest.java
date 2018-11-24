package testing;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MultiplyerTest {

    private static Multiplyer multiplyer;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
        multiplyer = new Multiplyer();
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }

    @Before
    public void setUp() {
        System.out.println("Before each test");
    }

    @After
    public void tearDown() {
        System.out.println("After each test");
    }

    @Test
    public void shouldReturn20WhenMultiplying2() {
        //        Given
        System.out.println("Test1");
        int toMultiply = 2;
        int expectedResult = 20;
        //        When
        int result = multiplyer.multiplyByTen(toMultiply);
        //        Then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn90WhenMultiplying9() {
        //        Given
        System.out.println("Test2");
        int toMultiply = 9;
        int expectedResult = 90;
        //        When
        int result = multiplyer.multiplyByTen(toMultiply);
        //        Then
        assertEquals(expectedResult, result);
    }
}