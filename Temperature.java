
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the input temperature scale (C, F, K): ");
        String inputScale = scanner.next().toUpperCase();

        System.out.println("Enter the output temperature scale (C, F, K): ");
        String outputScale = scanner.next().toUpperCase();

        double result;

        if (inputScale.equals("C")) {
            if (outputScale.equals("F")) {
                result = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + result);
            } else if (outputScale.equals("K")) {
                result = temperature + 273.15;
                System.out.println("Temperature in Kelvin: " + result);
            } else {
                System.out.println("Invalid output scale.");
            }
        } else if (inputScale.equals("F")) {
            if (outputScale.equals("C")) {
                result = (temperature - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + result);
            } else if (outputScale.equals("K")) {
                result = (temperature + 459.67) * 5 / 9;
                System.out.println("Temperature in Kelvin: " + result);
            } else {
                System.out.println("Invalid output scale.");
            }
        } else if (inputScale.equals("K")) {
            if (outputScale.equals("C")) {
                result = temperature - 273.15;
                System.out.println("Temperature in Celsius: " + result);
            } else if (outputScale.equals("F")) {
                result = temperature * 9 / 5 - 459.67;
                System.out.println("Temperature in Fahrenheit: " + result);
            } else {
                System.out.println("Invalid output scale.");
            }
        } else {
            System.out.println("Invalid input scale.");
        }

        scanner.close();
    }
}
