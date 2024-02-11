import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9/5) - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the temperature value: ");
            double temperature = scanner.nextDouble();

            System.out.print("Enter the original unit (C, K, or F): ");
            String originalUnit = scanner.next().toUpperCase();

            double celsius, fahrenheit, kelvin;

            if (originalUnit.equals("C")) {
                celsius = temperature;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
            } else if (originalUnit.equals("F")) {
                fahrenheit = temperature;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = fahrenheitToKelvin(fahrenheit);
            } else if (originalUnit.equals("K")) {
                kelvin = temperature;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = kelvinToFahrenheit(kelvin);
            } else {
                System.out.println("Invalid unit. Please enter C, K, or F.");
                return;
            }

            System.out.printf("%.2f %s is equivalent to:%n", temperature, originalUnit);
            System.out.printf("%.2f C%n", celsius);
            System.out.printf("%.2f F%n", fahrenheit);
            System.out.printf("%.2f K%n", kelvin);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid numerical value for temperature.");
        }
    }
}
