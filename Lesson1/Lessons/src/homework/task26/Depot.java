package homework.task26;

import java.util.ArrayList;
import java.util.List;

public class Depot {
    private final double limit;
    private double currentVolume;

    List<Grocery> groceries = new ArrayList<>();

    public Depot(double limit) {
        if (limit <= 0) {
            System.exit(0);
        }
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void addGrocery(Grocery item, double weight) {

        double volume = convertKgToV(weight, item);

        if (currentVolume + volume > limit) {
            throw new RuntimeException("Depot is full");
        }

        currentVolume += volume;
        groceries.add(item);
    }

    public void removeGrocery(Grocery item, double weight) {

        double volume = convertKgToV(weight, item);

        currentVolume -= volume;

        if (currentVolume < 0) {
            currentVolume = 0;
        }

        groceries.remove(item);
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    private <T extends Grocery> double convertKgToV(double kg, T item) {
        return kg * item.getV();

    }

    public double getFreeVolume() {
        return limit - currentVolume;
    }
}
