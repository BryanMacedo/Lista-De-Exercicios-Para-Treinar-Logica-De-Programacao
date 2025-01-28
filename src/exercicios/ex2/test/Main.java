package exercicios.ex2.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número qualquer: ");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("O número " + number + " é um número par");
        }else {
            System.out.println("O número " + number + " é um número ímpar");
        }

        if (number == 0){
            System.out.println("O número " + number + " não é nem negativo nem positivo ele é um número neutro");
        } else if (number > 0) {
            System.out.println("O número " + number + " é um número positivo");
        } else{
            System.out.println("O número " + number + " é um número negativo");
        }

        sc.close();
    }
}
