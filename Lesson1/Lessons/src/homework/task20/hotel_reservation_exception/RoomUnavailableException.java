package homework.task20.hotel_reservation_exception;

public class RoomUnavailableException extends BookingExceptions{
    RoomUnavailableException(){
        super("Room is not available");
    }
}
