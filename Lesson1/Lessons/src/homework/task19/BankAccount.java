package homework.task19;

public class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;

    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("The Balance is:" + balance);
            return;
        }
        throw new InsufficientFundsException(amount);

    }

}
