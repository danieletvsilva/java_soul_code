package Repeticao;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        int numero, soma = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        for(int i = 2; i <= numero; i +=2){
            soma = soma + i;
            System.out.println("Adição de " + i + " no resultado da soma =  " + soma);
        }
    }
}
