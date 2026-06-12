package homework.task27;

import java.util.Objects;

public class HouseholdAppliance {
    private String type;
    private String brand;
    private String model;
    private int power;

    public HouseholdAppliance(String type,
                              String brand,
                              String model,
                              int power) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (!(o instanceof HouseholdAppliance))
            return false;

        HouseholdAppliance that =
                (HouseholdAppliance) o;

        return Objects.equals(type, that.type)
                && Objects.equals(brand, that.brand)
                && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, model);
    }

    @Override
    public String toString() {
        return type + " " + brand + " " + model;
    }
}
