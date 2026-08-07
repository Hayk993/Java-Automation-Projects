package homework.atm;

public class ATMImpl implements ATMService {
    private ATMState state = ATMState.IDLE;

    private final String correctPin = "1234";

    private int pinAttempts = 0;

    @Override
    public Result withdraw(int amount, int balance, int dailyLimitRemaining) {
        return null;
    }

    @Override
    public void insertCard() {

        if (state == ATMState.IDLE) {
            state = ATMState.PIN_VERIFICATION;
            System.out.println("Card Inserted");
        }
    }

    @Override
    public boolean enterPin(String pin) {

        if (state != ATMState.PIN_VERIFICATION) {
            return false;
        }

        if (pin.equals(correctPin)) {

            state = ATMState.AUTHENTICATED;
            pinAttempts = 0;

            System.out.println("Correct PIN");

            return true;
        }

        pinAttempts++;

        System.out.println("Wrong PIN");

        if (pinAttempts == 3) {

            state = ATMState.CARD_BLOCKED;

            System.out.println("Card Blocked");
        }

        return false;
    }

    @Override
    public void ejectCard() {

        state = ATMState.IDLE;
        pinAttempts = 0;

        System.out.println("Card Ejected");
    }

    @Override
    public String withdraw(boolean accountActive,
                           int amount,
                           int balance,
                           int dailyLimitRemaining) {

        // Card is blocked
        if (state == ATMState.CARD_BLOCKED) {
            return "DENIED_ACCOUNT_BLOCKED";
        }

        // User is not authenticated
        if (state != ATMState.AUTHENTICATED) {
            return "DENIED_ACCOUNT_BLOCKED";
        }

        // Condition 1
        if (!accountActive) {
            return "DENIED_ACCOUNT_BLOCKED";
        }

        // Condition 2
        if (amount < 100 || amount > 20000 || amount % 100 != 0) {
            return "DENIED_INVALID_AMOUNT";
        }

        // Condition 3
        if (balance < amount) {
            return "DENIED_INSUFFICIENT_BALANCE";
        }

        // Condition 4
        if (amount > dailyLimitRemaining) {
            return "DENIED_LIMIT_EXCEEDED";
        }

        return "APPROVED";
    }

    public ATMState getState() {
        return state;
    }


}
