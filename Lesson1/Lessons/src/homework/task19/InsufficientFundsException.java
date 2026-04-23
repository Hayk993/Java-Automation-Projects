package homework.task19;

public class InsufficientFundsException extends Exception {
    private double missingAmount;

    public InsufficientFundsException(double missingAmount) {
        super(" Missing amount: " + missingAmount);
        this.missingAmount = missingAmount;
    }


}
