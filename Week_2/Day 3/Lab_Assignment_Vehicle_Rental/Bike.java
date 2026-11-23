/**
 * Bike subclass.
 * INHERITANCE: extends Vehicle and uses super(...) to call the parent constructor.
 * POLYMORPHISM: overrides calculateRent() and displayDetails().
 */
public class Bike extends Vehicle {

    public Bike(String vehicleNumber, String model, double ratePerDay, int days) {
        super(vehicleNumber, model, ratePerDay, days);
    }

     @Override
    public double calculateRent() {
        return super.calculateRent() * 0.90;             
    }
   
    @Override
    public void displayDetails() {
        System.out.printf("%-5s| %-12s | %-8s | Days: %d | Rent: %.1f%n", "Bike", getVehicleNumber(), getModel(), getDays(), calculateRent());
    }

}
