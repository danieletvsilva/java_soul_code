package Repeticao;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número: ");
        numero = scan.nextInt();

       /* do {
            System.out.println(numero);
            numero -= 2;
        } while (numero != 0);*/

        for (int i = 0; i <= numero; numero-=2) {
            System.out.println(numero);
        }
    }
}
