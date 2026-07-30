package homework.atm;

public class Main {
    public static void main(String[] args) {

        ATMService atm = new ATMImpl();

        TestCase tc1 = new TestCase("DT-01", true, 500, 1000, 1000, "APPROVED");

        runTest(atm, tc1);
        // DT-01
        runTest(atm, new TestCase("DT-01", true, 500, 1000, 1000, "APPROVED"));

        // DT-02
        runTest(atm, new TestCase("DT-02", true, 500, 1000, 400, "DENIED_LIMIT_EXCEEDED"));
//---------------------------------------------------------------------------------
        //Amount = 99
        runTest(atm, new TestCase("BVA-01", true, 99, 1000, 1000, "DENIED_INVALID_AMOUNT"));

// Amount = 100
        runTest(atm, new TestCase("BVA-02", true, 100, 1000, 1000, "APPROVED"));

// Amount = 101
        runTest(atm, new TestCase("BVA-03", true, 101, 1000, 1000, "DENIED_INVALID_AMOUNT"));
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


