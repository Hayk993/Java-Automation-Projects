package homework.task20.airline_exception;

public class Passenger {
    private  boolean passport;
    private  boolean boardingPass;
    private  boolean visa;

    Passenger(boolean passport, boolean boardingPass, boolean visa){
        this.passport = passport;
        this.boardingPass = boardingPass;
        this.visa = visa;
    }

    public boolean isPassport() {
        return passport;
    }

    public boolean isBoardingPass() {
        return boardingPass;
    }

    public boolean isVisa() {
        return visa;
    }
}
