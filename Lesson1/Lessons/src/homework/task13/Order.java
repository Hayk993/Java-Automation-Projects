package homework.task13;

public class Order {
    private int id;
   private String customerName;
   private double orderPrice;
    private int deliveryTime;

    private static int totalOrders;
    private static double deliveryFee;

    Order(int id, String customerName, double orderPrice){
        this.id = id;
        this.customerName = customerName;
        this.orderPrice = orderPrice;
        this.deliveryTime = 60;

        totalOrders++;
    }
    Order(int id, String customerName, double orderPrice, int deliveryTime){
        this.id = id;
        this.customerName = customerName;
        this.orderPrice = orderPrice;
        this.deliveryTime = deliveryTime;

        totalOrders++;
    }
     public double calculateTotalPrice() {
        return orderPrice + deliveryFee;
    }
    //get

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
    public static int getTotalOrders(){
        return totalOrders;
    }
 //set

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public static void setDeliveryFee(double deliveryFee) {
        Order.deliveryFee = deliveryFee;
    }

}
