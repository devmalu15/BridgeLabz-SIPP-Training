import java.util.ArrayList;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Setters
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate per day: " + rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

// Car subclass
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate(); // 5% of rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance policy (hidden): " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        if (insurancePolicyNumber.length() > 3)
            return "***" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3);
        else
            return "***";
    }
}

// Bike subclass
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.02 * getRentalRate(); // 2% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance policy (hidden): " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        if (insurancePolicyNumber.length() > 3)
            return "***" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3);
        else
            return "***";
    }
}

// Truck subclass
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000; // flat charge for truck
    }

    @Override
    public double calculateInsurance() {
        return 0.1 * getRentalRate(); // 10% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance policy (hidden): " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        if (insurancePolicyNumber.length() > 3)
            return "***" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3);
        else
            return "***";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C123", 1500, "CARINS12345"));
        vehicles.add(new Bike("B456", 500, "BIKEINS678"));
        vehicles.add(new Truck("T789", 3000, "TRUCKINS54321"));

        int rentalDays = 3;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance cost: " + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println("------------------------------");
        }
    }
}
