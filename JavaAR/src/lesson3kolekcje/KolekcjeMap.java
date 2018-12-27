package lesson3kolekcje;

import java.util.HashMap;
import java.util.Map;

public class KolekcjeMap {
    public static void main(String[] args) {

        //Kolekcje - Mapa
        //Bazuje na sposobie zapisu: klucz-wartość
        System.out.println("*HashMap*");
        Map<Integer, String> map = new HashMap<>();

        //Klucze muszą być unikalne żeby nie stracić wartości
        map.put(1,"jeden");
        map.put(2,"dwa");
        map.put(3,"trzy");

        //Wyświetlanie HashMapy - iteracja poprzez gettery
        for (Map.Entry<Integer, String> m : map.entrySet()){
            int key = m.getKey();
            String value = m.getValue();

            System.out.println("Klucz: " + key + ", wartość: " + value);
        }

        System.out.println("Wyświetl wszystkie wartości: " + map.values());
        System.out.println("Wyświetl wartość klucza nr 2: " + map.get(2));
    }
}
