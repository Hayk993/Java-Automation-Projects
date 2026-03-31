package homework.task13;

public class OrderDemo {
    public static void main(String[] args) {
        Order.setDeliveryFee(300);
        Order order1 = new Order(1,"Hayk",5000);
        Order order2 = new Order(2,"Anna",6000,120);
        System.out.println(order1.calculateTotalPrice());
        System.out.println(order2.calculateTotalPrice());
        System.out.println(Order.getTotalOrders());

    }
}
