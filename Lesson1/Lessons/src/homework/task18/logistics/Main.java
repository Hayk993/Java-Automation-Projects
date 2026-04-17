package homework.task18.logistics;

public class Main {
    public static void main(String[] args) {
        GroundShipping groundShipping = new GroundShipping();
        Order order1 = new Order(groundShipping);
        System.out.println(order1.finalizeOrder(10, 1000));
        AirShipping airShipping = new AirShipping();
        Order order2 = new Order(airShipping);
        System.out.println(order2.finalizeOrder(6, 300));
        DroneShipping droneShipping = new DroneShipping();
        Order order3 = new Order(droneShipping);
        System.out.println(order3.finalizeOrder(4, 1000));
        System.out.println(order3.finalizeOrder(6, 1000));
    }
}
