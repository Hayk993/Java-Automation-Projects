package homework.atm;

public class TestCase {
    private String testName;
    private boolean accountActive;
    private int amount;
    private int balance;
    private int dailyLimit;
    private String expectedResult;

    public TestCase(String testName, boolean accountActive, int amount, int balance, int dailyLimit, String expectedResult) {

        this.testName = testName;
        this.accountActive = accountActive;
        this.amount = amount;
        this.balance = balance;
        this.dailyLimit = dailyLimit;
        this.expectedResult = expectedResult;
    }

    public String getTestName() {
        return testName;
    }

    public boolean isAccountActive() {
        return accountActive;
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

    public String getExpectedResult() {
        return expectedResult;
    }
}
