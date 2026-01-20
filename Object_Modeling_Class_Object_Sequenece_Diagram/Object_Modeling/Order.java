import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void displayProduct() {
        System.out.println("- " + name + ": $" + price);
    }
}



class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.getOrderId());
    }

    public void viewOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order o : orders) {
            o.displayOrder();
        }
    }

    public String getName() {
        return name;
    }
}


public class Order {
    private static int orderCounter = 1;
    private int orderId;
    private ArrayList<Product> productList;

    public Order() {
        this.orderId = orderCounter++;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : productList) {
            p.displayProduct();
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
        System.out.println();
    }

    public int getOrderId() {
        return orderId;
    }

    public ArrayList<Product> getProducts() {
        return productList;
    }
     public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 800.00);
        Product p2 = new Product("Smartphone", 500.00);
        Product p3 = new Product("Headphones", 80.00);

        // Create customer
        Customer customer = new Customer("Alice");

        // Create first order
        Order order1 = new Order();
        order1.addProduct(p1);
        order1.addProduct(p3);

        // Create second order
        Order order2 = new Order();
        order2.addProduct(p2);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // View all orders
        customer.viewOrders();
    }
}


