package week2.day2.assignment1;

import java.util.Scanner;

public class SalaryCalculator {

    private static final double HRA_RATE = 0.20;
    private static final double DA_RATE = 0.10;
    private static final double TAX_THRESHOLD = 20000;
    private static final double PROFESSIONAL_TAX = 200;

    public static double calculateHra(double basic) {
        return basic * HRA_RATE;
    }

    public static double calculateDa(double basic) {
        return basic * DA_RATE;
    }

    public static double calculateGross(double basic) {
        double hra = calculateHra(basic);
        double da = calculateDa(basic);
        return basic + hra + da;
    }

    public static double calculateProfessionalTax(double gross) {
        return gross > TAX_THRESHOLD ? PROFESSIONAL_TAX : 0;
    }

    public static double calculateNet(double gross, double tax) {
        return gross - tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        double hra = calculateHra(basicSalary);
        double da = calculateDa(basicSalary);
        double grossSalary = calculateGross(basicSalary);
        double professionalTax = calculateProfessionalTax(grossSalary);
        double netSalary = calculateNet(grossSalary, professionalTax);

        System.out.printf("Employee ID: %d%n", employeeId);
        System.out.printf("Employee Name: %s%n", employeeName);
        System.out.printf("Basic Salary: %.2f%n", basicSalary);
        System.out.printf("HRA: %.2f%n", hra);
        System.out.printf("DA: %.2f%n", da);
        System.out.printf("Gross Salary: %.2f%n", grossSalary);
        System.out.printf("Professional Tax Deducted: %.2f%n", professionalTax);
        System.out.printf("Net Salary: %.2f%n", netSalary);

        scanner.close();
    }
}
