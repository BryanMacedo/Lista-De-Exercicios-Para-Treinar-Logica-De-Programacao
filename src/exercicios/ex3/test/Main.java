package exercicios.ex3.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int value01 = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int value02 = sc.nextInt();

        if (value01 == value02){
            System.out.println("\nOs valores são iguais");

            int C = value01 + value02;

            System.out.println("Valores iguais serão somados...");
            System.out.println("Resultado: " + C);
        }else {
            System.out.println("\nOs valores são diferentes");

            int C = value01 * value02;

            System.out.println("Valores diferentes serão multiplicados...");
            System.out.println("Resultado: " + C);
        }

        sc.close();

    }
}
