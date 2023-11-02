package RD.Function;

import java.util.Scanner;

public class Temrature {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Kelvin to Celsius");
        System.out.println("4. Celsius to Kelvin");
        System.out.println("5. Kelvin to Fahrenheit");
        System.out.println("6. Fahrenheit to Kelvin");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        double inputTemperature;
        double resultTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                inputTemperature = sc.nextDouble();
                resultTemperature = celsiusToFahrenheit(inputTemperature);
                System.out.println("Temperature in Fahrenheit: " + resultTemperature + " °F");
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemperature = sc.nextDouble();
                resultTemperature = fahrenheitToCelsius(inputTemperature);
                System.out.println("Temperature in Celsius: " + resultTemperature + " °C");
                break;
            case 3:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemperature = sc.nextDouble();
                resultTemperature = kelvinToCelsius(inputTemperature);
                System.out.println("Temperature in Celsius: " + resultTemperature + " °C");
                break;
            case 4:
                System.out.print("Enter temperature in Celsius: ");
                inputTemperature = sc.nextDouble();
                resultTemperature = celsiusToKelvin(inputTemperature);
                System.out.println("Temperature in Kelvin: " + resultTemperature + " K");
                break;
            case 5:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemperature = sc.nextDouble();
                resultTemperature = kelvinToFahrenheit(inputTemperature);
                System.out.println("Temperature in Fahrenheit: " + resultTemperature + " °F");
                break;
            case 6:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemperature = sc.nextDouble();
                resultTemperature = fahrenheitToKelvin(inputTemperature);
                System.out.println("Temperature in Kelvin: " + resultTemperature + " K");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                break;
        }
        sc.close();
    }
}
