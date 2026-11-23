/**
 * Base class representing a vehicle in the rental shop.
 * INHERITANCE: Car and Bike extend this class and call super(...).
 * Fields are private (encapsulation); subclasses use the getters.
 */
public class Vehicle {

    private String vehicleNumber;  
    private String model;
    private double ratePerDay;     
    private int    days;

    public Vehicle(String vehicleNumber, String model, double ratePerDay, int days) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.ratePerDay = ratePerDay;
        this.days = days;
    }

    // Base rent — overridden by Car/Bike (POLYMORPHISM)
    public double calculateRent() {
        return ratePerDay * days;
    }

    // Base display — overridden by Car/Bike (POLYMORPHISM)
    public void displayDetails() {
        System.out.printf("%-5s| %-12s | %-8s | Days: %d | Rent: %.1f%n",
                "Vehicle", vehicleNumber, model, days, calculateRent());
    }

    // Getters — subclasses access private fields through these
    public String getVehicleNumber() { return vehicleNumber; }
    public String getModel()         { return model; }
    public double getRatePerDay()    { return ratePerDay; }
    public int    getDays()          { return days; }
}