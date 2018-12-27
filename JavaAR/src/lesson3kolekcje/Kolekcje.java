package lesson3kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Kolekcje {
    public static void main(String[] args) {

        //*Kolekcja - ArrayList
        System.out.println("*ArrayList*");
        List<String> listaStr = new ArrayList<>();

        //Dodawanie obiektów do ArrayList
        listaStr.add("jeden");
        listaStr.add("dwa");
        listaStr.add("trzy");

/*
        for (String str : listaStr) {
            System.out.println(str);
        }
*/

        //Wyświetlenie obiektów w pętli
        for(int i = 0; i < listaStr.size(); i++){
            System.out.println(listaStr.get(i));
        }

        //Umieszczanie na liście kolejnych elementów w środku, nie tracimy elementu który tam  był
        listaStr.add(1,"zero");
        for(int i = 0; i < listaStr.size(); i++){
            System.out.println(listaStr.get(i));
        }
        System.out.println(listaStr.size());

        //Usuwanie elementów z listy
        listaStr.remove(1);
        for(int i = 0; i < listaStr.size(); i++){
            System.out.println(listaStr.get(i));
        }
        System.out.println(listaStr.size());

        //Sprawdzenie czy obiekt znajduje się na liście
        System.out.println(listaStr.contains("zero"));

        //Sprawdzenie na jakim indexie znajduje się element
        System.out.println(listaStr.indexOf("trzy"));
    }

}
