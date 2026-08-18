package homework.atm;

public class TestCase {
    private String testName;
    private int amount;
    private int balance;
    private int dailyLimit;
    private Result expectedResult;

    public TestCase(String testName,
                    int amount,
                    int balance,
                    int dailyLimit,
                    Result expectedResult) {

        this.testName = testName;
        this.amount = amount;
        this.balance = balance;
        this.dailyLimit = dailyLimit;
        this.expectedResult = expectedResult;
    }

    public String getTestName() {
        return testName;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public int getDailyLimit() {
        return dailyLimit;
    }

    public Result getExpectedResult() {
        return expectedResult;
    }
}
