package exercicios.ex24.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas horas será gasto na viagem? ");
        double hours = sc.nextDouble();

        System.out.print("Qual foi a velocidade média durante a viagem? ");
        double speed = sc.nextDouble();

        double distance =  hours * speed;

        System.out.println("\nA distancia percorrida foi: " + distance + " km");

        double liters = distance / 12;

        System.out.printf("A quantidade de litros usados foi: %.2f litros", liters);


        sc.close();
    }
}
