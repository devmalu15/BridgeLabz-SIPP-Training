package ClassAndObject.Class_and_Object;
public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            quantity = 0;
        }
    }

    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 55000.0, 1);
        item.addItem(1);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
