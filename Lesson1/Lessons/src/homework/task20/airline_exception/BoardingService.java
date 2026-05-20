package homework.task20.airline_exception;

public class BoardingService {
    public void boardPassenger(Passenger passenger) throws BoardExceptions {
        if (!passenger.isPassport()) {
            throw new ExpiredPassportException();
        }
        if (!passenger.isVisa()) {
            throw new NoVisaException();
        }
        if (!passenger.isBoardingPass()) {
            throw new InvalidBoardingPassException();
        }
        System.out.println("Passenger passed successfully");
    }

}
