package exercicios.ex13.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int age = sc.nextInt();

        System.out.println("\nImprimindo informações");
        System.out.println("Nome: " + name);

        if (age < 18){
            System.out.println("Você tem " + age + " anos e é menor de idade");
        }else {
            System.out.println("Você tem " + age + " anos e é maior de idade");
        }

        sc.close();
    }
}
