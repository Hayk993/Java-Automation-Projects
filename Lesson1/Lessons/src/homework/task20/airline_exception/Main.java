package homework.task20.airline_exception;

public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger(true, true, true);
        BoardingService b1 = new BoardingService();
        try {
            b1.boardPassenger(p1);
        } catch (ExpiredPassportException passport) {
            System.out.println(passport.getMessage());
        } catch (NoVisaException e) {
            System.out.println(e.getMessage());
        } catch (BoardExceptions e) {
            System.out.println(e.getMessage());
        }
        Passenger p2 = new Passenger(true, false, true);
        BoardingService b2 = new BoardingService();
        try {
            b1.boardPassenger(p2);
        } catch (ExpiredPassportException passport) {
            System.out.println(passport.getMessage());
        } catch (NoVisaException e2) {
            System.out.println(e2.getMessage());
        } catch (BoardExceptions e2) {
            System.out.println(e2.getMessage());


        }
    }
}
