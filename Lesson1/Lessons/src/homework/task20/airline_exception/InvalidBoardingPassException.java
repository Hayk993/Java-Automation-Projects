package homework.task20.airline_exception;

public class InvalidBoardingPassException extends BoardExceptions {
    InvalidBoardingPassException() {
        super("have not passenger boarding pass");
    }
}
