package homework.task20.hotel_reservation_exception;

public class UnderAgeException extends BookingExceptions {
    UnderAgeException(int age) {
        super("the age is" + age + " you have to 18+");
    }
}
