package homework.task18.logistics;

public class GroundShipping implements ShippingCalculator {
    @Override
    public double calculateCost(double weight, double distance) {
        return 1000 + distance * 200;
    }
}
