package homework.task18.logistics;

public class DroneShipping implements ShippingCalculator {
    @Override
    public double calculateCost(double weight, double distance) {
        if (weight > 5) {
            System.out.println("the max weight is 5kg");
            System.exit(1);
        }
        return 3000;
    }
}
