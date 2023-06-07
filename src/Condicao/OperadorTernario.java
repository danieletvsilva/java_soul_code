package Condicao;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //(verificação) ? "caso verdade" : "caso falso"

        Scanner scan = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Digite seu nome:  ");
        nome = scan.nextLine();

        System.out.println("Qual a sua idade? ");
        idade = scan.nextInt();;

        System.out.println((idade >=18) ? "Bem vindo" : "Você não pode acessar");
    }
}
