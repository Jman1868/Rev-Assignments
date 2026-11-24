import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        
        Employee[] employees = {
            new Employee(1, "Alice", "Engineering", 75000),
            new Employee(2, "Bob", "Sales", 62000),
            new Employee(3, "Carol", "HR", 58000),
            new Employee(4, "David", "Finance", 68000),
            new Employee(5, "Eve", "Marketing", 64000)
        };


        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            output.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            Employee[] readEmployees = (Employee[]) input.readObject();

            for (Employee employee : readEmployees) {
                System.out.println(employee);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
