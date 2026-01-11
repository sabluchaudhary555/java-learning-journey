package p1basics.decisionmaking;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("    TEMPERATURE CONVERTER PROGRAM");
        System.out.println("========================================");

        // Display menu
        System.out.println("\nSelect Conversion Type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.println("7. Exit");
        System.out.println("========================================");

        System.out.print("\nEnter your choice (1-7): ");
        int choice = sc.nextInt();

        double temperature, result;

        switch (choice) {
            case 1:
                // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                result = (temperature * 9/5) + 32;
                System.out.println("\n" + temperature + "°C = " + result + "°F");
                break;

            case 2:
                // Celsius to Kelvin
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                result = temperature + 273.15;
                System.out.println("\n" + temperature + "°C = " + result + " K");
                break;

            case 3:
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                result = (temperature - 32) * 5/9;
                System.out.println("\n" + temperature + "°F = " + result + "°C");
                break;

            case 4:
                // Fahrenheit to Kelvin
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                result = (temperature - 32) * 5/9 + 273.15;
                System.out.println("\n" + temperature + "°F = " + result + " K");
                break;

            case 5:
                // Kelvin to Celsius
                System.out.print("Enter temperature in Kelvin: ");
                temperature = sc.nextDouble();

                if (temperature < 0) {
                    System.out.println("\nError: Kelvin cannot be negative!");
                } else {
                    result = temperature - 273.15;
                    System.out.println("\n" + temperature + " K = " + result + "°C");
                }
                break;

            case 6:
                // Kelvin to Fahrenheit
                System.out.print("Enter temperature in Kelvin: ");
                temperature = sc.nextDouble();

                if (temperature < 0) {
                    System.out.println("\nError: Kelvin cannot be negative!");
                } else {
                    result = (temperature - 273.15) * 9/5 + 32;
                    System.out.println("\n" + temperature + " K = " + result + "°F");
                }
                break;

            case 7:
                // Exit
                System.out.println("\nThank you for using Temperature Converter!");
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("\nInvalid choice! Please select between 1-7.");
                break;
        }

        System.out.println("========================================");

        sc.close();
    }
}

// Created by SSoft.in
// Sablu Software IT solutions