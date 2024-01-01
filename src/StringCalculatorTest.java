import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void emptyString() {
        Assert.assertEquals(stringCalculator.Add(""), 0);
    }

}
