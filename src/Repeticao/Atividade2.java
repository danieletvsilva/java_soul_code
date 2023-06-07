package Repeticao;

public class Atividade2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            for (int j = 15; j >= i; j--) {
                System.out.println("A soma de " + i + " + " + j + " = " + (i + j));
            }
        }
    }
}

