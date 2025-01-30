package exercicios.ex20.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Qual tabuada deseja visualizar? ");
        int choice = sc.nextInt();

        System.out.println("=============");
        System.out.println("TABUADA DO " + choice);
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(choice + " x " + i + " = " + i * choice);
            if (i == 10){
                System.out.println("=============");
            }
        }

        sc.close();
    }
}
