package homework.task12;

public class Home {
    private int roomNumber;
    private boolean entrance;
    private int bathroomsNum;
    private int balcony;
    private double areaSize;
    private String address;


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
}
