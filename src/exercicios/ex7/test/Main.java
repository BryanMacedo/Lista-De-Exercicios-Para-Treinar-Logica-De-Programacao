package exercicios.ex7.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor booleano [true / false]: ");
        boolean b1 = sc.nextBoolean();

        System.out.print("Digite outro valor booleano [true / false]: ");
        boolean b2 = sc.nextBoolean();

        if (b1 == b2){
            System.out.print("\nAmbos os valores são iguais");
            if (b1== true){
                System.out.println(" e são verdadeiros");
            }else {
                System.out.println(" e são falsos");
            }
        } else {
            System.out.print("\nOs dois valores são diferentes sendo o primeiro valor ");
            if (b1 == true){
                System.out.print("verdadeiro");
            }else {
                System.out.print("falso");
            }

            System.out.print(" e o segundo valor sendo ");
            if (b2 == true){
                System.out.print("verdadeiro");
            }else {
                System.out.print("falso");
            }
        }
        sc.close();
    }
}
