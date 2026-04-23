package homework.task20.hotel_reservation_exception;

public class BookingService {
    private Room[] rooms;

    public BookingService(Room[] rooms) {
        this.rooms = rooms;
    }

    public void bookRoom(Guest g, Room r) throws BookingExceptions {
        if (g.getAge() < 18) {
            throw new UnderAgeException(g.getAge());
        }
        if (r.isEmpty){
            r.isEmpty = false;
            System.out.println("the room " + r.roomNumber + "is booked for " +g.getName() );
        }
        for (Room room : rooms) {
            if (room.isEmpty){
                r.isEmpty = false;
                System.out.println("the room " + r.roomNumber + "is booked for " +g.getName() );
            }
        }
        throw new RoomUnavailableException();

    }
}
