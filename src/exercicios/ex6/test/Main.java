package exercicios.ex6.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");
        double value = sc.nextDouble();

        double readjustment = value + (value * 0.05);

        System.out.println("O valor " + value + " com um reajuste de 5% é de: " + readjustment);
        sc.close();
    }
}
