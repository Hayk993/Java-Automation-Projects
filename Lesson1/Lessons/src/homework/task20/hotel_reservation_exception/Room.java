package homework.task20.hotel_reservation_exception;

public class Room {
    boolean isEmpty;
    int roomNumber;

    public Room(boolean isEmpty, int roomNumber) {
        this.isEmpty = isEmpty;
        this.roomNumber = roomNumber;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
