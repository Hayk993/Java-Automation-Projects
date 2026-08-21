
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMultiplicationTest {
    Calculator calculator = new Calculator();

    @Test(groups = "smoke")
    public void testMultiplicationPositiveNumbers() {
        int result = calculator.multiply(5, 4);

        Assert.assertEquals(result, 20);
    }

    @Test(groups = "smoke",dependsOnMethods = "testMultiplicationPositiveNumbers")
    public void testMultiplicationByZero() {
        int result = calculator.multiply(10, 0);

        Assert.assertEquals(result, 1);
    }
    @Test(dependsOnMethods = "testMultiplicationByZero" )
    public void multiplicationTest() {
        Assert.assertEquals(calculator.multiply(5, 5), 25);
    }
}
