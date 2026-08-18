package homework.atm;

public class ATMImpl implements ATMService {
    private ATMState state = ATMState.IDLE;
    private Card currentCard;
    private int pinAttempts = 0;

    @Override
    public void insertCard(Card card) {
        currentCard = card;
        state = ATMState.PIN_VERIFICATION;
        System.out.println("Card Inserted");
    }

    @Override
    public boolean enterPin(String pin) {

        if (state != ATMState.PIN_VERIFICATION) {
            return false;
        }

        if (!currentCard.isActive()) {
            state = ATMState.CARD_BLOCKED;
            return false;
        }

        if (pin.equals(currentCard.getPin())) {

            state = ATMState.AUTHENTICATED;
            pinAttempts = 0;

            System.out.println("Correct PIN");

            return true;
        }

        pinAttempts++;

        System.out.println("Wrong PIN");

        if (pinAttempts == 3) {

            currentCard.blockCard();
            state = ATMState.CARD_BLOCKED;

            System.out.println("Card Blocked");
        }

        return false;
    }

    @Override
    public void ejectCard() {

        currentCard = null;
        pinAttempts = 0;
        state = ATMState.IDLE;

        System.out.println("Card Ejected");
    }

    @Override
    public Result withdraw(int amount,
                           int balance,
                           int dailyLimitRemaining) {

        if (state == ATMState.CARD_BLOCKED) {
            return Result.DENIED_ACCOUNT_BLOCKED;
        }

        if (state != ATMState.AUTHENTICATED) {
            return Result.DENIED_ACCOUNT_BLOCKED;
        }

        if (amount < 100 || amount > 20000 || amount % 100 != 0) {
            return Result.DENIED_INVALID_AMOUNT;
        }

        if (balance < amount) {
            return Result.DENIED_INSUFFICIENT_BALANCE;
        }

        if (amount > dailyLimitRemaining) {
            return Result.DENIED_LIMIT_EXCEEDED;
        }

        return Result.APPROVED;
    }

    public ATMState getState() {
        return state;
    }

}
