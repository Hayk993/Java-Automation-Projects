package homework.task12;



public class Car {

    private String brand;
    private int maxEngineOilKm;
    private int maxGearboxOilKm;

    private int currentEngineOilKm = 0;
    private int currentGearboxOilKm = 0;

    public Car(String brand, int maxEngineOilKm, int maxGearboxOilKm) {
        this.brand = brand;
        this.maxEngineOilKm = maxEngineOilKm;
        this.maxGearboxOilKm = maxGearboxOilKm;
    }

    // Սիմուլացնում է վարելը

        public void drive(int km) {

            if (!canDrive()) {
                System.out.println("Cannot drive!");
                return;
            }

            currentEngineOilKm += km;
            currentGearboxOilKm += km;
        }

    // Փոխում ենք մատոռի յուղը
    public void changeEngineOil() {
        currentEngineOilKm = 0;
        System.out.println("Engine oil changed.");
    }

    // Փոխում ենք կառոբկի յուղը
    public void changeGearboxOil() {
        currentGearboxOilKm = 0;
        System.out.println("Gearbox oil changed.");
    }

    // Կարո՞ղ է մեքենան վարել
    public boolean canDrive() {
        return currentEngineOilKm <= maxEngineOilKm &&
                currentGearboxOilKm <= maxGearboxOilKm;
    }

    public void printStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Engine oil km: " + currentEngineOilKm + "/" + maxEngineOilKm);
        System.out.println("Gearbox oil km: " + currentGearboxOilKm + "/" + maxGearboxOilKm);
        System.out.println("Can drive: " + canDrive());
        System.out.println("----------------------");
    }
}

