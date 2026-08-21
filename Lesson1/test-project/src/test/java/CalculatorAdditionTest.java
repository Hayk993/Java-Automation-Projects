import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorAdditionTest {
    Calculator calculator  = new Calculator();


    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Before methode");
    }

    @DataProvider(name = "multiplyDataProviderForAdd")
    public Object[][] multiplyDataProviderForAdd() {
        return new Object[][]{{10, 20, 30},
                {-10, -20, -30},
                {10, -5, 5},
                {0, 0, 0}
        };
    }

    @Test(dataProvider = "multiplyDataProviderForAdd")
    public void testMultiplyDataProviderForAdd(int a, int b, int expected) {
        SoftAssert softAssert = new SoftAssert();
        int actual = calculator.add(a, b);
        softAssert.assertEquals(actual, expected);
        softAssert.assertAll();
    }
    @Test(groups = {"smoke", "regression"})
    public void additionTest() {
        Assert.assertEquals(calculator.add(10, 20), 30);
    }
    @AfterMethod
    public void tearDown() {
        calculator = null;
        System.out.println("Cleaning up");
    }
}
