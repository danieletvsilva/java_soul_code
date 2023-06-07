package LeituraValores;

import java.util.Scanner;

public class LeituraValores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numero;

        System.out.println("Digite um número: ");
        numero = scan.nextDouble();

        System.out.println("O número digitado: " + numero);
    }

}
