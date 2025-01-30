package exercicios.ex19.test;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("=============");
            System.out.println("TABUADA DO " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
                if (i == 10 && j ==10){
                    System.out.println("=============");
                }
            }
        }
    }
}
