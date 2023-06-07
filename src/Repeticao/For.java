package Repeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        for(int i = 0; i < 10; i++){
            System.out.println("Qual a sua idade?");
            idade = scan.nextInt();

            if(idade >= 18){
                System.out.println("Você é maior de idade");
            }else{
                System.out.println("Você é menor de idade");
            }
        }

    }
}
