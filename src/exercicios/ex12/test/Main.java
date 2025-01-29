package exercicios.ex12.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double finalValue;

        System.out.print("Informe o valor do produto: R$ ");
        double value = sc.nextDouble();

        System.out.println("\n--- Formas de pagamento ---");
        System.out.println("1 - À Vista em Dinheiro ou Pix");
        System.out.println("2 - À Vista no cartão de crédito");
        System.out.println("3 - Parcelado no cartão em duas vezes");
        System.out.println("4 - Parcelado no cartão entre três a doze vezes");
        System.out.print("Qual será a forma de pagamento? ");
        int choice = sc.nextInt();

        System.out.println();

        switch (choice){
            case 1 ->{
                finalValue = value - value * 0.15;
                System.out.println("Você escolheu pagamento à vista / pix!");
                System.out.println("Pagamentos à vista / pix tem 15% de desconto");
                System.out.println("Valor a ser pago: R$ " + finalValue);
            }
            case 2 ->{
                finalValue = value - value * 0.10;
                System.out.println("Você escolheu pagamento à vista no cartão de crédito!");
                System.out.println("Pagamentos à vista no cartão de crédito tem 10% de desconto");
                System.out.println("Valor a ser pago: R$ " + finalValue);
            }
            case 3 -> {
                finalValue = value;
                System.out.println("Você escolheu pagamento no cartão em duas vezes!");
                System.out.println("Pagamentos no cartão em 2 vezes não possui desconto");
                System.out.println("Valor a ser pago: R$ " + finalValue);
            }
            case 4 -> {
                finalValue = value + value * 0.10;
                System.out.print("Em quantas vezes você desejá parcelar? [3 a 12 vezes] ");
                int installments = sc.nextInt();
                System.out.println("Pagamentos no cartão em " + installments + " vezes possui 10% de juros!");
                System.out.println("Valor total a ser pago: R$ " + finalValue);
                double installmentsValue = finalValue / installments;
                System.out.println("Valor de cada parcela a ser pago: R$ " + installmentsValue);
            }
            default -> {
                System.out.println("Opção invalida!!!");
            }
        }
        sc.close();
    }
}
