package homework.task26;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Depot depot = new Depot(200);

        Grocery meat = new Meat(
                new Date(),
                new Date(),
                "Grand Meat");

        Grocery sugar = new Sugar(
                new Date(),
                new Date(),
                "Sweet Factory"
        );

        depot.addGrocery(meat, 20);

        System.out.println("Occupied volume: "
                + depot.getCurrentVolume());

        System.out.println("Free volume: "
                + depot.getFreeVolume());

        depot.addGrocery(sugar, 10);
        System.out.println("Occupied volume: "
                + depot.getCurrentVolume());

        System.out.println("Free volume: "
                + depot.getFreeVolume());

        depot.removeGrocery(meat, 5);

        System.out.println("Occupied volume after remove: "
                + depot.getCurrentVolume());

        System.out.println("Free volume after remove: "
                + depot.getFreeVolume());
    }
}
