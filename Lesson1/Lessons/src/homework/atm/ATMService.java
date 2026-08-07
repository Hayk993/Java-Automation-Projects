package homework.atm;

public interface ATMService {
    Result withdraw(int amount,
                    int balance,
                    int dailyLimitRemaining);

    void insertCard();

    void ejectCard();

    boolean enterPin(String pin);
    String withdraw(boolean accountActive, int amount, int balance, int dailyLimitRemaining);
}
