package lesson4kolekcjaset;

import java.util.*;

public class KolekcjaSet {
    public static void main(String[] args) {

        //Kolekcje - Set
        //Nie pozwala na wyświetlanie duplikatów
        //Wyświetlanie jest losowe
        Set<String> setStr = new HashSet<>();

        setStr.add("jeden");
        setStr.add("cztery");
        setStr.add("dwa");
        setStr.add("trzy");
        setStr.add("jeden");

        //Pokazanie elementów kolekcji
        for (String s : setStr){
            System.out.println(s);
        }

        //Totolotek
        System.out.println("Witamy w totolotku");

        Set<Integer> lotekSet = new HashSet<>();

        Random r = new Random();

        while (lotekSet.size() < 6){
            int x = r.nextInt(36)+1;
            System.out.println("Wylosowano: " + x);
            lotekSet.add(x);
        }

        for(Integer i : lotekSet){
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //Wrzucanie kolekcji do tablicy
        List<Integer> intList = new ArrayList<>();
        intList.addAll(lotekSet);

        for(int x = 0; x < intList.size(); x++){
            System.out.print(intList.get(x) + " ");
        }
    }
}