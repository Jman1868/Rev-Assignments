public class Car extends Vehicle {
    private double insurancePerDay;

    public Car(String vehicleNumber, String model, double ratePerDay, int days, double insurancePerDay) {
        super(vehicleNumber, model, ratePerDay, days);   // parent constructor
        this.insurancePerDay = insurancePerDay;
    }

    @Override
    public double calculateRent() {
  
        return super.calculateRent() + (insurancePerDay * getDays());
    }

    @Override
    public void displayDetails() {
        System.out.printf("%-5s| %-12s | %-8s | Days: %d | Rent: %.1f%n",
                "Car", getVehicleNumber(), getModel(), getDays(), calculateRent());
    }
}
