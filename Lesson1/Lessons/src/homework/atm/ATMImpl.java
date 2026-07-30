package homework.atm;

public class ATMImpl implements ATMService {
    @Override
    public String withdraw(boolean accountActive,
                           int amount,
                           int balance,
                           int dailyLimitRemaining) {

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
}
