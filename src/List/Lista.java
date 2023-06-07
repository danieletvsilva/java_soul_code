package List;

import java.util.*;

public class Lista {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        List<Integer> listaInt = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        String n;

        //ADD
        /*listString.add("SoulOn");
        listString.add("Curso Java");

        for (int i = 0; i < 3; i++) {
            System.out.println("Olá, digite um nome: ");
            n = scan.nextLine();
            listString.add(n);
        }

        //percorre a lista e mostra os valores
        for (String valor : listString) {
            System.out.println(valor);
        }

        System.out.println("---Número de Elementos---");
        System.out.println(listString.size());*/

        //SET

        /*listString.add("SoulOn");
        listString.add("Curso Java");
        listString.add("Daniele");

        System.out.println("---Método GET---");//Mostra o valor do índice selecionado
        System.out.println(listString.get(1));

        System.out.println("---Método SET---"); //Modifica algum valor
        System.out.println(listString.set(0, "Curso SoulOn"));

        for(String i : listString){
            System.out.println(i);*/

        //REMOVE
        listString.add("SoulOn");
        listString.add("Curso Java");
        listString.add("Daniele");

        System.out.println("---Lista sem ordenar---");
        for(String i : listString){
            System.out.println(i);
        }

        /*System.out.println("---Lista ordenada---");
        Collections.sort(listString);
        for(String i : listString){
            System.out.println(i);*/

        System.out.println("---Lista sem ordenar---");
        listString.remove(0);
        for(String i : listString){
            System.out.println(i);
        }
}
}


