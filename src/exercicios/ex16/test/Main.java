package exercicios.ex16.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Lendo os lados de um triângulo ---");

        System.out.print("Lado a: ");
        int a = sc.nextInt();

        System.out.print("Lado b: ");
        int b = sc.nextInt();

        System.out.print("Lado c: ");
        int c = sc.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("\nOs valores informados formam um triângulo");
            if (a == b && b == c){
                System.out.println("O triângulo é equilátero");
            } else if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a)) {
                System.out.println("O triângulo é isósceles");
            }else {
                System.out.println("O triângulo é escaleno");
            }
        }else {
            System.out.println("Os valores informados não formam um triângulo");
        }

        sc.close();
    }
}
