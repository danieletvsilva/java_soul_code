package Condicao;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char calculo;
        int n1, n2, resultado;

        System.out.println("Qual calculo quer fazer? + ou *");
        calculo = scan.nextLine().charAt(0);

        System.out.println("Digite um valor = ");
        n1 = scan.nextInt();

        System.out.println("Digite um valor = ");
        n2 = scan.nextInt();

        switch(calculo){
            case '+':
                System.out.println("Soma = " + (resultado = n1 + n2));
                break;
            case '*':
                System.out.println("Multiplicação = " + (resultado = n1 * n2));
                break;
            default:
                System.out.println("Você digitou errado");
        }

    }
}
