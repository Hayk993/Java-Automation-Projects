package homework.task28;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;

    public Customer(String firstName,
                    String lastName,
                    String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (!(o instanceof Customer customer))
            return false;

        return email.equals(customer.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();

    }
    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
