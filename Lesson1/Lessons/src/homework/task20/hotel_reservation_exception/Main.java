package homework.task20.hotel_reservation_exception;

public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(true,1);
        Room r2 = new Room(false,1);
        Room r3 = new Room(true,1);
        Room r4 = new Room(true,1);

        Guest g1 = new Guest(14,"Alen");
        Guest g2 = new Guest(18,"Ani");
        Guest g3 = new Guest(15,"Ashot");

        BookingService b1 = new BookingService(new Room[]{r1,r2,r3,r4});
        try {
            b1.bookRoom(g1,r1);
        }catch (BookingExceptions e){
            System.out.println( e.getMessage());
        }


    }
}
