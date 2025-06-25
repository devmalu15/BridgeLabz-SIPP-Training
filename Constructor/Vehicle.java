package Constructor;
public class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // class variable
    static double registerationFee = 10000;

    // constructor to initialize instance variables
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
    // Method to display vehicle details, Instance Method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registerationFee);
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double updatedFee) {
        registerationFee = updatedFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        Vehicle v2 = new Vehicle("Alice", "Bike");

        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(12000);

        v2.displayVehicleDetails();
    }
}