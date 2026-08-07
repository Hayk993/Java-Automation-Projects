package homework.atm;

public interface ATMService {
    Result withdraw(int amount, int balance, int dailyLimitRemaining);

    void insertCard(Card card);

    void ejectCard();

    boolean enterPin(String pin);

}
