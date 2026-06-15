package homework.task28;

public class Order {
    private int id;
    private String productName;
    private Customer customer;

    public Order(int id, String productName,Customer customer) {

        this.id = id;
        this.productName = productName;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Customer getCustomer() {
        return customer;
    }
}
