package homework.task20.airline_exception;

public class ExpiredPassportException extends BoardExceptions {
    ExpiredPassportException() {
       super("passport expired");
    }
}
