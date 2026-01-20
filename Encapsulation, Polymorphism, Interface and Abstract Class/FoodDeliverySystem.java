import java.util.ArrayList;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters (restricted to protected for encapsulation)
    protected void setPrice(double price) {
        this.price = price;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

interface Discountable {
    void applyDiscount(double percent);

    String getDiscountDetails();
}

// VegItem subclass
class VegItem extends FoodItem implements Discountable {
    private double discountApplied;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double percent) {
        double discount = (percent / 100) * calculateTotalPrice();
        discountApplied = discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg item discount applied: " + discountApplied;
    }
}

// NonVegItem subclass
class NonVegItem extends FoodItem implements Discountable {
    private double discountApplied;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        double nonVegCharge = 0.10 * baseTotal; // 10% extra charge for non-veg
        return baseTotal + nonVegCharge;
    }

    @Override
    public void applyDiscount(double percent) {
        double discount = (percent / 100) * calculateTotalPrice();
        discountApplied = discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg item discount applied: " + discountApplied;
    }
}

// Main class
public class FoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        // Polymorphic processing
        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable disc = (Discountable) item;
                disc.applyDiscount(10); // apply 10% discount
                System.out.println(disc.getDiscountDetails());
            }

            System.out.println("----------------------------");
        }
    }
}
