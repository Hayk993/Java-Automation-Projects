package homework.Task13;

public class Product {
    private int id;
    private String productName;
    private double price;
    private int quantity;

    private static double discount;

    Product(int id, String productName, double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    Product(int id, String productName, double price, int quantity, double discount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public static void setDiscountRate(double rate){
        discount = rate;
    }

    public double calculateFinalPrice(){
        return price - (price * discount / 100);
    }
}


