package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[4];
        //int[] b;
        //b = new int[16];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um número: ");
            a[i] = scan.nextInt();
        }
        /*for(int l = 0; l < a.length; l++){
            System.out.println("Valor = " + a[l] + "está no elemento " + l);
        }*/
        for(int o : a){
            System.out.print(o + " ");
        }
    }
}
