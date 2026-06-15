package homework.task28;

import homework.task28.Customer;
import homework.task28.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer(
                "Hayk",
                "Mkrtchyan",
                "hayk@mail.com"
        );

        Customer c2 = new Customer(
                "Ani",
                "Petrosyan",
                "ani@mail.com"
        );

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(1, "Phone", c1));
        orders.add(new Order(2, "Laptop", c1));
        orders.add(new Order(3, "TV", c2));
        orders.add(new Order(4, "Mouse", c1));
        orders.add(new Order(5, "Keyboard", c2));

        HashMap<Customer, Integer> customerOrders =
                new HashMap<>();

        for (Order order : orders) {

            Customer customer = order.getCustomer();

            customerOrders.put(
                    customer,
                    customerOrders.getOrDefault(customer, 0) + 1
            );
        }

        System.out.println("Part 1");

        for (Customer customer : customerOrders.keySet()) {
            System.out.println(
                    customer + " -> "
                            + customerOrders.get(customer)
            );
        }

        TreeMap<String, Integer> sortedCustomers =
                new TreeMap<>();

        for (Customer customer : customerOrders.keySet()) {

            sortedCustomers.put(
                    customer.getFirstName(),
                    customerOrders.get(customer)
            );
        }

        System.out.println("\nPart 2");

        for (String name : sortedCustomers.keySet()) {

            System.out.println(
                    name + " -> "
                            + sortedCustomers.get(name)
            );
        }
    }
}