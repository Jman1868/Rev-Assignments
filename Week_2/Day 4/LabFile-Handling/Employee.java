import java.io.Serializable;

public class Employee implements Serializable{
    
    int employeId;
    String empName;
    String department;
    double salary;

    private static final long serialVersionUID = 1L;

    public Employee(int employeId, String empName, String department, double salary) {
        this.employeId = employeId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    @Override 
    public String toString(){
        return ("Employe id: "+ employeId +
        "Employe Name: " + empName + 
        "Employee Department: " + department + 
        "Employee Salary: " + salary);
    }

}
