package homework.task20.airline_exception;

public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger(false, true, true);
        BoardingService b1 = new BoardingService();
        try {
            b1.boardPassenger(p1);
        } catch (BoardExceptions e1) {
            System.out.println(e1.getMessage());

            Passenger p2 = new Passenger(true, false, true);
            BoardingService b2 = new BoardingService();
            try {
                b1.boardPassenger(p2);
            } catch (BoardExceptions e2) {
                System.out.println(e2.getMessage());

            }
        }
    }
}
