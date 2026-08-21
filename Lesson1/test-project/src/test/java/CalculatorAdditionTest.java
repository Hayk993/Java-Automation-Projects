import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorAdditionTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdditionPositiveNumbers() {
        int result = calculator.add(10, 20);

        Assert.assertEquals(result, 30);
    }

    @Test
    public void testAdditionNegativeNumbers() {
        int result = calculator.add(-10, -20);

        Assert.assertEquals(result, -30);
    }
}
