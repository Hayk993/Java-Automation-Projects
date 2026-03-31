package homework.task13;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product(2233, "vine", 2000,5);
        Product product2 = new Product(3399,"bread",200,66,3);
       Product.setDiscountRate(3);
        System.out.println(product1.calculateFinalPrice());

    }


}
