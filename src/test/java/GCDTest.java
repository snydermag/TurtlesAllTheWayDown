import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    void gcdTest2() {
        int expected = 2;
        int actual = GCD.gcd(16, 10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void gcdTest4() {
        int expected = 4;
        int actual = GCD.gcd(8, 12);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void gcd2Test3() {
        int expected = 3;
        int actual = GCD.gcd(6, 9);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void gcd2Test1() {
        int expected = 1;
        int actual = GCD.gcd(57, 91);

        Assert.assertEquals(expected, actual);
    }
}