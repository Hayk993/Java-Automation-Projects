package homework.task19;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(5000);
        try {
            b1.withdraw(4100);
            b1.withdraw(900);
            b1.withdraw(100);
        } catch (InsufficientFundsException e) {
            System.out.println("sorry there is not enough money");
        }
    }
}
