import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorSubtractionTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSubtractionPositiveNumbers() {
        int result = calculator.subtract(20, 10);

        Assert.assertEquals(result, 10);
    }

    @Test
    public void testSubtractionNegativeResult() {
        int result = calculator.subtract(10, 20);

        Assert.assertEquals(result, -10);
    }
    @Test(groups = {"smoke"})
    public void subtractionTest() {
        Assert.assertEquals(calculator.subtract(20, 10), 10);
    }
}
