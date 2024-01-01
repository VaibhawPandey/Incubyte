import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testEmptyString() {
        Assert.assertEquals(stringCalculator.Add(""), 0);
    }

    @Test
    public void testSingleNumber() {
        Assert.assertEquals(stringCalculator.Add("1"), 1);
    }
    @Test
    public void testMultipleNumber() {
        Assert.assertEquals(stringCalculator.Add("1,2,3,4"), 10);
    }
}
