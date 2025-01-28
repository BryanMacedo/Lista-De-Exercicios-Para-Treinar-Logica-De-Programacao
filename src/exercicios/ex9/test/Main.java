package exercicios.ex9.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculo de Índice de Massa Corporal ---");

        System.out.print("Digite o seu peso: kg ");
        double weight = sc.nextDouble();

        System.out.print("Digite a sua altura: ");
        double height = sc.nextDouble();

        double imc = weight / (Math.pow(height, 2));

        if (imc < 18.5){
            System.out.printf("\nSeu IMC é: %.2f e você esta abaixo do peso", imc);
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.printf("\nSeu IMC é: %.2f e você esta no peso ideal", imc);
        }else if (imc >= 25.0 && imc <= 29.9) {
            System.out.printf("\nSeu IMC é: %.2f e você esta levemente acima do peso", imc);
        }else if (imc >= 30.0 && imc <= 34.9) {
            System.out.printf("\nSeu IMC é: %.2f e você esta com obesidade grau I", imc);
        }else if (imc >= 35.0 && imc <= 39.9) {
            System.out.printf("\nSeu IMC é: %.2f e você esta com obesidade grau II (severa)", imc);
        }else if (imc >= 40.0) {
            System.out.printf("\nSeu IMC é: %.2f e você esta com obesidade grau III (mórbida)", imc);
        }

        sc.close();
    }
}
