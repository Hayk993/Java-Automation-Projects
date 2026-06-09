package homework.task27;

public class Buyer {
    private String firstName;
    private String lastName;
    private String purchaseDate;
    private String address;

    public Buyer(String firstName,
                 String lastName,
                 String purchaseDate,
                 String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.purchaseDate = purchaseDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + purchaseDate + " " + address;
    }
}
