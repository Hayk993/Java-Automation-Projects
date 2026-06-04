package homework.task23;

public class House implements Comparable<House> {
    private double squareMeters;

    public House(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    @Override
    public int compareTo(House other) {

        return Double.compare(
                this.squareMeters,
                other.squareMeters
        );
    }

    @Override
    public String toString() {

        return "House: " + squareMeters + "m²";
    }
}
