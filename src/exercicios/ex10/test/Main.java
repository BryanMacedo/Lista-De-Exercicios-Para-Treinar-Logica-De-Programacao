package exercicios.ex10.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Calculando a média de notas dos alunos ---");

        System.out.print("Digite a sua primeira nota: ");
        double grade01 = sc.nextDouble();

        System.out.print("Digite a sua segunda nota: ");
        double grade02 = sc.nextDouble();

        System.out.print("Digite a sua terceira nota: ");
        double grade03 = sc.nextDouble();

        double sum = grade01 + grade02 + grade03;
        double[] grades = {grade01, grade02, grade03};

        double average = sum / grades.length;

        System.out.printf("\nA sua média é de: %.1f", average);
    }
}
