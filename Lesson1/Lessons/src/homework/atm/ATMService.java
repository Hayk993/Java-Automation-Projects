package homework.atm;

public interface ATMService {
    String withdraw(boolean accountActive, int amount, int balance, int dailyLimitRemaining);
}
