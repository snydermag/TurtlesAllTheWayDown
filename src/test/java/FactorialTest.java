import org.junit.Assert;
import org.junit.Test;



public class FactorialTest {

    @Test
    public void factorialTest5() {
        long expected = 120;

        long actual = Factorial.factorial(5);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void factorialTest4() {
        long expected = 24;

        long actual = Factorial.factorial(4);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void factorialTest7() {
        long expected = 5040;

        long actual = Factorial.factorial(7);

        Assert.assertEquals(expected, actual);

    }
}