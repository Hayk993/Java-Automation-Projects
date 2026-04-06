package homework.task17;

public class Apartment extends ResidentialBuilding {
    private int floor;

    Apartment(int numOfRooms, double area, int floor) {
        super(numOfRooms, area);
        if (floor > 0 && floor <= 5) {
            this.floor = floor;

        } else {
            System.out.println("invalid floor please switch 1-5");
            System.exit(1);
        }


    }
    public int getFloor() {
        return floor;
    }

}
