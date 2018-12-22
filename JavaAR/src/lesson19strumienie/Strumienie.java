package lesson19strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Strumienie {
    public static void main(String[] args) {


        //Make objects
        List<Mieszkanie> mList = Arrays.asList(
                new Mieszkanie("Lublin", "Czechów", "Koncertowa", 4, 63.2f, true, 343000),
                new Mieszkanie("Lublin", "LSM", "Pana Balcera", 3, 46.5f, false, 250000),
                new Mieszkanie("Warszawa", "Wola", "Olbrachta", 4, 68.0f, true, 480000),
                new Mieszkanie("Kraków", "Krowodrza", "Kijowska", 3, 48.7f, false, 345000),
                new Mieszkanie("Lublin", "Tatary", "Przyjaźni", 2, 32.3f, false, 165999)
        );

        //First implementation
        mList.stream()
                .filter(mieszkanie -> mieszkanie.getMiasto().equals("Lublin"))
                .filter(mieszkanie -> mieszkanie.getPokoje() > 1)
                .filter(mieszkanie -> mieszkanie.getCena() < 300000)
                .map(mieszkanie -> mieszkanie.getMiasto() + " " + mieszkanie.getPokoje() + " " + mieszkanie.getCena())
                .forEach(System.out::println);

        //Second implementation
        Predicate<Mieszkanie> mNazwa = m -> m.getPokoje().equals(3);

        List<Mieszkanie> lista = new ArrayList<>();

        lista = mList.stream()
                .filter(mNazwa)
                .collect(Collectors.toList());

        System.out.println(lista);

//Old bad method:
//        for (Mieszkanie m: mList) {
//            if (m.getMiasto().equals("Lublin")){
//                if (m.getCena() < 300000){
//                    if (m.getPokoje() > 2){
//                        System.out.println(m.getMiasto() + " " + m.getCena() + " " + m.getPokoje());
//                    }
//                }
//            }
//
//        }
    }
}
