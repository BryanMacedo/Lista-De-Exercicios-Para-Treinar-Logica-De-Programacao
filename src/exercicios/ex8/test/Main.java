package exercicios.ex8.test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int value01 = sc.nextInt();

        System.out.print("Informe um número inteiro diferente do anterior: ");
        int value02 = sc.nextInt();

        System.out.print("Informe mais um número inteiro diferente dos anteriores: ");
        int value03 = sc.nextInt();

        System.out.println();

        int[] values = {value01, value02, value03};

        Arrays.sort(values); // ordena um array de forma crescente

        if (value01 != value02 && value01 != value03 && value02 != value03){
            System.out.print("Valores em ordem decrescente: ");
            for (int i = values.length - 1; i >= 0; i--) {
                System.out.print(values[i] + " ");
            }
        }else{
            System.out.println("\nOs valores informados devem ser diferentes!!!");
        }

        sc.close();
    }
}
