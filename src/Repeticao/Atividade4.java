package Repeticao;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        int idade = 0, i =0, soma=0;

        /*for (i = 0; i < 4 ; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual a sua idade?");
            idade = scan.nextInt();
            soma += idade;
        }*/


        while(i < 4){
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual a sua idade?");
            idade = scan.nextInt();
            soma += idade;
            i++;
        }
        System.out.println("A média das idades é: " + (soma/i));
    }
}
