package homework.task23;

public class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Car)) {
            return false;
        }

        Car other = (Car) obj;

        return this.brand.equals(other.brand);
    }

    @Override
    public String toString() {
        return brand;
    }
}
