package Day2;

//interface Taxable
interface Taxable{
	double calculateTax();
	String getTaxDetails();
}

//abstract product class
abstract class Product{
	int productId;
	String name;
	double price;
	
	public Product(int productId,String name,double price) {
		this.productId=productId;
		this.name=name;
		this.price=price;
	}
	
	// Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //Absract method
    public abstract double calculateDiscount();
    
    //Final price Calculator
    public void printFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0.0;
        double finalPrice = price + tax - discount;

        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("-----------------------------------");
    }
}

//Electronics Class
class Electronics extends Product implements Taxable {
 public Electronics(int productId, String name, double price) {
     super(productId, name, price);
 }

 public double calculateDiscount() {
     return getPrice() * 0.10;  // 10% discount
 }

 public double calculateTax() {
     return getPrice() * 0.18;  // 18% GST
 }

 public String getTaxDetails() {
     return "18% GST applied for electronics.";
 }
}

//Clothing Class
class Clothing extends Product implements Taxable {
 public Clothing(int productId, String name, double price) {
     super(productId, name, price);
 }

 public double calculateDiscount() {
     return getPrice() * 0.15;  // 15% discount
 }

 public double calculateTax() {
     return getPrice() * 0.12;  // 12% GST
 }

 public String getTaxDetails() {
     return "12% GST applied for clothing.";
 }
}

//Groceries Class
class Groceries extends Product {
 public Groceries(int productId, String name, double price) {
     super(productId, name, price);
 }

 public double calculateDiscount() {
     return getPrice() * 0.05;  // 5% discount
 }
 // No tax applied – not implementing Taxable
}

//main class
public class ECommercePlatform {
	public static void main(String[] args) {
		// Create products
	    Product p1 = new Electronics(201, "Smartphone", 30000);
	    Product p2 = new Clothing(202, "T-Shirt", 1500);
	    Product p3 = new Groceries(203, "Wheat Flour", 800);
	    Product p4 = new Electronics(204, "Laptop", 60000);
	    Product p5 = new Clothing(205, "Jacket", 3500);

	    // Store in array and use polymorphism
	    Product[] products = { p1, p2, p3, p4, p5 };
	    
	    for (Product p : products) {
	        p.printFinalPrice();
	    }
	 }
}
