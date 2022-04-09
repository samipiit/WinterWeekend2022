package learn_junit;

import org.junit.*;

public class LearnAssertions {

    static int count = 1;

    int addition(int num1, int num2) {
        return num1 + num2;
    }

    int subtraction(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        }
        return num2 - num1;
    }

    int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    int division(int num1, int num2) {
        if (num1 > num2) {
            return num1 / num2;
        }
        return num2 / num1;
    }

    @BeforeClass
    public static void runBeforeClass() {
        System.out.println("BEFORE CLASS\n");
    }

    @Before
    public void runBeforeEachTest() {
        System.out.println("BEFORE TEST " + count + "\n");
    }

    @After
    public void runAfterEachTest() {
        System.out.println("AFTER TEST " + count + "\n");
        count++;
    }

    @AfterClass
    public static void runAfterClass() {
        System.out.println("AFTER CLASS");
    }

    @Test
    public void testAddition() {
        Assert.assertEquals("ACTUAL DOES NOT MATCH EXPECTED RESULT", 30, addition(5, 25));
    }

    @Ignore
    @Test
    public void testSubtraction() {
        Assert.assertEquals("ACTUAL DOES NOT MATCH EXPECTED RESULT", 20, subtraction(5, 25));
    }

    @Ignore
    @Test
    public void testMultiplication() {
        Assert.assertEquals("ACTUAL DOES NOT MATCH EXPECTED RESULT",125, multiplication(5, 25));
    }

    @Ignore
    @Test
    public void testDivision() {
        Assert.assertEquals("ACTUAL DOES NOT MATCH EXPECTED RESULT", 5, division(5, 25));
    }

}
