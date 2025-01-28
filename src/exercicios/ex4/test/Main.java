package exercicios.ex4.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int value = sc.nextInt();

        System.out.println("O número antecessor de " + value + " é: " + (value - 1));
        System.out.println("O número sucessor de " + value + " é: " + (value + 1));

        sc.close();
    }
}
