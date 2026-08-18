
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMultiplicationTest {
    Calculator calculator = new Calculator();

    @Test
    public void testMultiplicationPositiveNumbers() {
        int result = calculator.multiply(5, 4);

        Assert.assertEquals(result, 20);
    }

    @Test
    public void testMultiplicationByZero() {
        int result = calculator.multiply(10, 0);

        Assert.assertEquals(result, 0);
    }
}
