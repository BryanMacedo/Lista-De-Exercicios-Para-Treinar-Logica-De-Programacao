package exercicios.ex22.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para A: ");
        int A = sc.nextInt();

        System.out.print("Digite um valor para B: ");
        int B = sc.nextInt();

        System.out.println("\nO quociente da divisão entre " + A + " e " + B + " é de: " + A / B);
        System.out.println("O resto da divisão entre " + A + " e " + B + " é de: " + A % B);

        sc.close();
    }
}
