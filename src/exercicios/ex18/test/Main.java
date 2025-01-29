package exercicios.ex18.test;

public class Main {
    public static void main(String[] args) {
        double heightFrancisco = 1.10;
        double heightSara = 1.50;

        int years = 0;

        while (heightFrancisco <= heightSara){
            heightFrancisco += 0.03;
            heightSara += 0.02;
            years ++;
        }

        System.out.println("Será necessário " + years + " anos para que Francisco seja maior que Sara.");
    }
}
