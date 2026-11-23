import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main application.
 *
 * POLYMORPHISM (explicit):
 *   Vehicle v = new Car(...);   // parent reference -> Car object
 *   Vehicle v = new Bike(...);  // parent reference -> Bike object
 *   v.calculateRent();          // runs the OVERRIDDEN method at runtime
 *   v.displayDetails();         // runs the OVERRIDDEN method at runtime
 */
public class RentalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int type = -1;
            // keep asking until 1 or 2
            while (type != 1 && type != 2) {
                System.out.print("Enter type (1-Car, 2-Bike): ");
                type = sc.nextInt();
                if (type != 1 && type != 2) {
                    System.out.println("Invalid vehicle type. Please try again.");
                }
            }

            //Input
            System.out.print("Enter Vehicle Number: ");
            String number = sc.next();

            System.out.print("Enter Model: ");
            String model = sc.next();

            System.out.print("Enter Rate per Day: ");
            double rate = sc.nextDouble();

            System.out.print("Enter Days: ");
            int days = sc.nextInt();

            
            Vehicle v;

            //If car
            if (type == 1) 
            {
                System.out.print("Enter Insurance per Day: ");
                double insurance = sc.nextDouble();
                v = new Car(number, model, rate, days, insurance);
            } 
            //If bike
            else 
            {
                v = new Bike(number, model, rate, days);           
            }
            vehicles.add(v);
        }

        System.out.println("--- Rental Details ---");
        double total = 0.0;
        for (Vehicle v : vehicles) {         
            v.displayDetails();
            total += v.calculateRent();
        }

        System.out.printf("Total Rent Collected: %.1f%n", total);
        sc.close();
    }
}