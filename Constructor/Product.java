package Constructor;
public class Product {

    // instance Variable
    String productName;
    double price;

    // class variable
    static int totalProducts = 0;

    public Product(String productName, double price) { // Constructor to initialize product name and price
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment the total products count
    }

    // Method to display product details,Instance Method
    public void DisplayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // method to display total products, Static Method
    public static void DisplayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Mobile Phone", 15000);
        Product prod2 = new Product("Laptop", 50000);

        prod1.DisplayProductDetails(); // Display details of product 1
        prod2.DisplayProductDetails(); // Display details of product 2

       Product.DisplayTotalProducts(); // Display total products count
    }

}