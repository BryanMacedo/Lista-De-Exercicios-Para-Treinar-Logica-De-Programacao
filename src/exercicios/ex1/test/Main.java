package exercicios.ex1.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor para A: ");
        int A = sc.nextInt();

        System.out.print("Informe um valor para B: ");
        int B = sc.nextInt();

        System.out.print("Informe um valor para C: ");
        int C = sc.nextInt();

        int soma = A + B;

        if (soma < C) {
            System.out.println("\nA soma de A e B é de: " + soma + " e é menor do que o valor de C que é: " + C);
        }else {
            System.out.println("\nA soma de A e B é de: " + soma + " e é maior do que o valor de C que é: " + C);
        }

        sc.close();
    }
}
