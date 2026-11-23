package com.banking.utility;

import java.util.Scanner;

public class InputUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) 
    {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getInt(String prompt) 
    {
        System.out.print(prompt);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public static long getLong(String prompt) 
    {
        System.out.print(prompt);
        long value = scanner.nextLong();
        scanner.nextLine();
        return value;
    }

    public static double getDouble(String prompt) 
    {
        System.out.print(prompt);
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

}
