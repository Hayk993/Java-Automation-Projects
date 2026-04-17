package homework.task18.logistics;

public class Order {
    private final ShippingCalculator shippingCalculator;

    Order(ShippingCalculator shippingCalculator){
        this.shippingCalculator = shippingCalculator;
    }
    public  double finalizeOrder(double weight, double distance){
         return  shippingCalculator.calculateCost(weight, distance);
    }

}
