package exercicios.ex14.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux;

        System.out.print("Digite um valor para A: ");
        int A = sc.nextInt();

        System.out.print("Digite um valor para B: ");
        int B = sc.nextInt();

        System.out.println("\nValor de A: " + A);
        System.out.println("Valor de B: " + B);

        System.out.println("\nInvertendo os valores de A e B");

        aux = A;
        A = B;
        B = aux;

        System.out.println("\nValor de A: " + A);
        System.out.println("Valor de B: " + B);

        sc.close();
    }
}
