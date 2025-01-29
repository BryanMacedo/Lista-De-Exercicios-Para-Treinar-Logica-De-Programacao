package exercicios.ex17.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Fahrenheit °F ");
        double temperatureFahrenheit = sc.nextDouble();

        double temperatureCelsius = (5 * ( temperatureFahrenheit-32) / 9);

        System.out.println("\nTemperatura em Fahrenheit: °F " + temperatureFahrenheit);
        System.out.println("Temperatura em Celsius: °C " + temperatureCelsius);

        sc.close();
    }
}
