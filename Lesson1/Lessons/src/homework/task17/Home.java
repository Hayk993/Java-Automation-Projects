package homework.task17;

public class Home extends ResidentialBuilding {
    private boolean gates = false;
    public Home(int numOfRooms, double area) {
        super(numOfRooms, area);
    }
    public  void openGates(){
        if (!gates){
            System.out.println("the gates is opened");
            gates = true;
        }
    }
    public void closeGates(){
        if (gates){
            System.out.println("the gates is closed");
            gates = false;
        }
    }
}
