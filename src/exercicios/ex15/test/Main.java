package exercicios.ex15.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int birthYear = sc.nextInt();

        System.out.print("Digite seu mês de nascimento: ");
        int birthMonth = sc.nextInt();

        System.out.print("Digite seu dia de nascimento: ");
        int birthDay = sc.nextInt();

        System.out.println("------------------------------------");

        System.out.print("Digite o ano atual: ");
        int currentYear = sc.nextInt();

        System.out.print("Digite o mês atual: ");
        int currentMonth = sc.nextInt();

        System.out.print("Digite o dia atual: ");
        int currentDay = sc.nextInt();

        int calculateYear = currentYear - birthYear;
        int calculateMonth = currentMonth - birthMonth;
        int calculateDay = currentDay - birthDay;

        if (calculateMonth < 0){
            calculateMonth += 12;
            calculateYear -= 1;
        }

        if (calculateDay < 0){
            calculateDay += 30;
            calculateMonth -= 1;
        }

        System.out.println("Você já viveu: " + calculateYear + " anos, " + calculateMonth
                + " meses e " + calculateDay + " dias");


    }
}
