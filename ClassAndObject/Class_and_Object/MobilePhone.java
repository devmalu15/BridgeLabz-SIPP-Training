package ClassAndObject.Class_and_Object;
public class MobilePhone {
    String brand;
    String model;
    int price;

    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Apple", "iPhone 14", 999);
        phone.displayDetails();

        MobilePhone anotherPhone = new MobilePhone("Samsung", "Galaxy S22", 799);
        anotherPhone.displayDetails();
    }
}