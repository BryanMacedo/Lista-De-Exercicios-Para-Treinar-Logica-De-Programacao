package exercicios.ex5.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double MINIMUM_WAGE = 1509.00;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do seu sálario: R$ ");
        double salary = sc.nextDouble();

        double quantityMinimumWage = salary / MINIMUM_WAGE;

        System.out.printf("Você recebe aproximadamente %.2f sálarios mínimos.", quantityMinimumWage);

        sc.close();
    }
}
