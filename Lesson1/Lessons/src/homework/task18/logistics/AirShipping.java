package homework.task18.logistics;

public class AirShipping implements ShippingCalculator {
    @Override
    public double calculateCost(double weight, double distance) {
        return 5000 + distance * 1000;
    }
}
