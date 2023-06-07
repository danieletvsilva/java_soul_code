package Condicao;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Digite seu nome:  ");
        nome = scan.nextLine();

        System.out.println("Qual a sua idade? ");
        idade = scan.nextInt();

        if(idade >= 18){
            System.out.println("Olá, você é maior de idade.");
        }else if(idade > 15 && idade < 18){
            System.out.println("Falta pouco para você conseguir acessar o sistema");
        }else{
            System.out.println("Ops, você não pode acessar");
        }
    }
}
