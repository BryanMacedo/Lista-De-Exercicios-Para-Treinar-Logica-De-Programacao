package exercicios.ex11.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Calculando a média de notas dos alunos ---");

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.print("Digite a sua primeira nota: ");
        double grade01 = sc.nextDouble();

        System.out.print("Digite a sua segunda nota: ");
        double grade02 = sc.nextDouble();

        System.out.print("Digite a sua terceira nota: ");
        double grade03 = sc.nextDouble();

        System.out.print("Digite a sua quarta nota: ");
        double grade04 = sc.nextDouble();

        System.out.println("----------------------------------------------");


        double sum = grade01 + grade02 + grade03 + grade04;
        double[] grades = {grade01, grade02, grade03, grade04};

        double average = sum / grades.length;

        System.out.println("\n------------ informações do aluno ------------");
        System.out.println("Nome do aluno: " + name);

        if (average >= 7){
            System.out.printf("A sua média é de %.1f e você esta aprovado!!!", average);
        }else {
            System.out.printf("A sua média é de %.1f e você esta reprovado!!!", average);
        }

        System.out.println("\n----------------------------------------------");

    }
}
