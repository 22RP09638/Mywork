import java.util.Scanner;

public class jq15 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the temperature:");
        double temperature = c.nextDouble();

        // Prompt user for choice of conversion
        System.out.println("Enter 1 to convert from Celsius to Fahrenheit");
        System.out.println("Enter 2 to convert from Fahrenheit to Celsius");
        int choice = c.nextInt();

        // Perform conversion based on user's choice
        double convertedTemperature;
        if (choice == 1) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
        } else if (choice == 2) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println("Temperature in Celsius: " + convertedTemperature);
        } else {
            System.out.println("Invalid choice. Please enter either 1 or 2.");
        }

        c.close();
    }

    // Static method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Static method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
