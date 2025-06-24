package ClassAndObject.Class_and_Object;
public class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;

    }

    public double totalCost(int quantity) {
        return price*quantity;
    }

    public void DisplayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 50000);
        item.DisplayDetails();

        int quantity=5;
        System.out.println("Total cost for " + item.itemName + " for quantity " + quantity + " is: " + item.totalCost(quantity));
    }
}