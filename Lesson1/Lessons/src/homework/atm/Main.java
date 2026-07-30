package homework.atm;

public class Main {
    public static void main(String[] args) {

        ATMService atm = new ATMImpl();

        runTest(atm, new TestCase("BVA-01", true, 99, 50000, 50000, "DENIED_INVALID_AMOUNT"));
        runTest(atm, new TestCase("BVA-02", true, 100, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("BVA-03", true, 101, 50000, 50000, "DENIED_INVALID_AMOUNT"));
        runTest(atm, new TestCase("BVA-04", true, 19999, 50000, 50000, "DENIED_INVALID_AMOUNT"));
        runTest(atm, new TestCase("BVA-05", true, 20000, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("BVA-06", true, 20001, 50000, 50000, "DENIED_INVALID_AMOUNT"));
        runTest(atm, new TestCase("BVA-07", true, 199, 50000, 50000, "DENIED_INVALID_AMOUNT"));
        runTest(atm, new TestCase("BVA-08", true, 200, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("BVA-09", true, 201, 50000, 50000, "DENIED_INVALID_AMOUNT"));

        runTest(atm, new TestCase("ST-01", true, 500, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("ST-02", true, 1000, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("ST-03", false, 500, 50000, 50000, "DENIED_ACCOUNT_BLOCKED"));
        runTest(atm, new TestCase("ST-04", false, 1000, 50000, 50000, "DENIED_ACCOUNT_BLOCKED"));
        runTest(atm, new TestCase("ST-05", true, 500, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("ST-06", true, 1000, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("ST-07", true, 500, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("ST-08", true, 1000, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("ST-09", false, 500, 50000, 50000, "DENIED_ACCOUNT_BLOCKED"));
        runTest(atm, new TestCase("ST-10", true, 500, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("ST-11", true, 1000, 50000, 50000, "APPROVED"));
        runTest(atm, new TestCase("ST-12", false, 500, 50000, 50000, "DENIED_ACCOUNT_BLOCKED"));
        runTest(atm, new TestCase("ST-13", true, 500, 50000, 50000, "APPROVED"));

        runTest(atm, new TestCase("DT-01", true, 500, 1000, 1000, "APPROVED"));
        runTest(atm, new TestCase("DT-02", true, 500, 1000, 400, "DENIED_LIMIT_EXCEEDED"));
        runTest(atm, new TestCase("DT-03", true, 500, 300, 1000, "DENIED_INSUFFICIENT_BALANCE"));
        runTest(atm, new TestCase("DT-04", true, 250, 1000, 1000, "DENIED_INVALID_AMOUNT"));
        runTest(atm, new TestCase("DT-05", false, 500, 1000, 1000, "DENIED_ACCOUNT_BLOCKED"));
    }

    public static void runTest(ATMService atm, TestCase testCase) {

        String actual = atm.withdraw(
                testCase.isAccountActive(),
                testCase.getAmount(),
                testCase.getBalance(),
                testCase.getDailyLimit()
        );

        System.out.println("--------------------------------");
        System.out.println(testCase.getTestName());
        System.out.println("Expected : " + testCase.getExpectedResult());
        System.out.println("Actual   : " + actual);

        if (actual.equals(testCase.getExpectedResult())) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}


