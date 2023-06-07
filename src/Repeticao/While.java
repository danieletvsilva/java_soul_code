package Repeticao;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int i = 0;

        Scanner leitura = new Scanner(System.in);

        while(i != 9){
            System.out.println("Bem vindo ao jogo");
            System.out.println("Digite um número para sair do loop");
            i = leitura.nextInt();
        }
        System.out.println("Você acertou! Fim de jogo");
    }
}
