import java.util.ArrayList;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Setters (protected for encapsulation)
    protected void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out
                .println("Vehicle ID: " + vehicleId + ", Driver: " + maskDriverName() + ", Rate per km: " + ratePerKm);
    }

    private String maskDriverName() {
        if (driverName.length() >= 3)
            return driverName.substring(0, 1) + "**";
        else
            return "**";
    }
}

interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}

// Car subclass
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        currentLocation = "Garage";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Bike subclass
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        currentLocation = "Parking Lot";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; // 10% discount for bike
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Auto subclass
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        currentLocation = "Auto Stand";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // base fare of 20
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Main class
public class RideHailingApp {
    public static void main(String[] args) {
        ArrayList<Vehicle> rides = new ArrayList<>();

        Car car = new Car("C101", "John", 15);
        Bike bike = new Bike("B202", "Ravi", 10);
        Auto auto = new Auto("A303", "Shyam", 12);

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        double tripDistance = 8.5;

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + tripDistance + " km: " + v.calculateFare(tripDistance));

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("Customer Pickup Point");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }
            System.out.println("-----------------------------");
        }
    }
}
