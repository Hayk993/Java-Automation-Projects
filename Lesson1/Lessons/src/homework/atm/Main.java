package homework.atm;

public class Main {
    public static void main(String[] args) {


            Card card = new Card(
                    "1234567890123456",
                    "1234",
                    true
            );

            ATMService atm = new ATMImpl();

            atm.insertCard(card);
            atm.enterPin("1234");

            runTest(atm, new TestCase("BVA-01", 99, 50000, 50000, Result.DENIED_INVALID_AMOUNT));
            runTest(atm, new TestCase("BVA-02", 100, 50000, 50000, Result.APPROVED));
            runTest(atm, new TestCase("BVA-03", 101, 50000, 50000, Result.DENIED_INVALID_AMOUNT));
            runTest(atm, new TestCase("BVA-04", 19999, 50000, 50000, Result.DENIED_INVALID_AMOUNT));
            runTest(atm, new TestCase("BVA-05", 20000, 50000, 50000, Result.APPROVED));
            runTest(atm, new TestCase("BVA-06", 20001, 50000, 50000, Result.DENIED_INVALID_AMOUNT));
            runTest(atm, new TestCase("BVA-07", 199, 50000, 50000, Result.DENIED_INVALID_AMOUNT));
            runTest(atm, new TestCase("BVA-08", 200, 50000, 50000, Result.APPROVED));
            runTest(atm, new TestCase("BVA-09", 201, 50000, 50000, Result.DENIED_INVALID_AMOUNT));

            runTest(atm, new TestCase("DT-01", 500, 1000, 1000, Result.APPROVED));
            runTest(atm, new TestCase("DT-02", 500, 1000, 400, Result.DENIED_LIMIT_EXCEEDED));
            runTest(atm, new TestCase("DT-03", 500, 300, 1000, Result.DENIED_INSUFFICIENT_BALANCE));
            runTest(atm, new TestCase("DT-04", 250, 1000, 1000, Result.DENIED_INVALID_AMOUNT));

            atm.ejectCard();
        }

        public static void runTest(ATMService atm, TestCase testCase) {

            Result actual = atm.withdraw(
                    testCase.getAmount(),
                    testCase.getBalance(),
                    testCase.getDailyLimit()
            );

            System.out.println("--------------------------------");
            System.out.println(testCase.getTestName());
            System.out.println("Expected : " + testCase.getExpectedResult());
            System.out.println("Actual   : " + actual);

            if (actual == testCase.getExpectedResult()) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
}


