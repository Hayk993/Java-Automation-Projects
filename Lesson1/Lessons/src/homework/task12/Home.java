package homework.task12;

public class Home {
    private int roomNumber;
    private boolean entrance;
    private int bathroomsNum;
    private int balcony;
    private double areaSize;
    private String address;

    Home(int room , boolean entrance , int bathroomsNum, int balcony ,int areaSize ,String address){
        this.roomNumber = room;
        this.entrance = entrance;
        this.bathroomsNum = bathroomsNum;
        this.balcony = balcony;
        this.areaSize = areaSize;
        this.address = address;

    }
    Home (Home outer) {
        roomNumber = outer.roomNumber;
        entrance = outer.entrance;;
        bathroomsNum = outer.bathroomsNum;;
        balcony = outer.balcony;
        areaSize = outer.areaSize;;
        address = outer.address;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isEntrance() {
        return entrance;
    }

    public int getBathroomsNum() {
        return bathroomsNum;
    }

    public int getBalcony() {
        return balcony;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public String getAddress() {
        return address;
    }

    //
    public void setRoomNumber(int roomNumber) {

        if (roomNumber >= 0) {
            this.roomNumber = roomNumber;
        }
    }

    public void setBathroomsNum(int bathroomsNum) {
        if (bathroomsNum>0){
            this.bathroomsNum = bathroomsNum;
        }
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }

    public void setBalcony(int balcony) {
        this.balcony = balcony;
    }
    public void printInfo(){
        System.out.println("the room number is " + roomNumber);
        System.out.println("the is the entrance " + entrance);
        System.out.println("the bathrooms number is " + bathroomsNum);
        System.out.println("the balcony number is " + balcony);
        System.out.println("the area size is " + areaSize);
        System.out.println("the address " + address);

    }
}
