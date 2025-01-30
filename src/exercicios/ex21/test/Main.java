package exercicios.ex21.test;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(101);
        System.out.println("Valor aleatório: " + randomNumber);
    }
}
