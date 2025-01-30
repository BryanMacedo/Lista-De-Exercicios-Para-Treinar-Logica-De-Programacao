package exercicios.ex23.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor da hora de aula? R$ ");
        double valueHour = sc.nextDouble();

        System.out.print("Quantas aulas são aplicadas no período de um mês? ");
        int quantityLessons = sc.nextInt();

        System.out.print("Quanto é o percentual de desconto do INSS? ");
        double percentageInss = sc.nextDouble();

        double grossSalary = valueHour * quantityLessons;
        System.out.println("\nO seu salario bruto é: R$ " + grossSalary);

        double discountInss =  (percentageInss / 100) * grossSalary;
        double netSalary = grossSalary - discountInss;

        System.out.println("O seu salario liquido é de: R$ " + netSalary);
        sc.close();
    }
}
