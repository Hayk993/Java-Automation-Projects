import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorDivisionTest {
    Calculator calculator = new Calculator();

    @Test()
    public void testDivision() {
        int result = calculator.divide(20, 5);

        Assert.assertEquals(result, 4);
    }

    @Test(priority = -1)
    public void testDivisionAnotherCase() {
        int result = calculator.divide(100, 10);

        Assert.assertEquals(result, 10);
    }

}
