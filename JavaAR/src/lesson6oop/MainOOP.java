package lesson6oop;

public class MainOOP {

    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv("Panasonic",51);
        Tv tv3 = new Tv("Panasonic",51);

        tv1.setMake("Sony");
        tv1.setDisplaySize(46);

        String make = tv1.getMake();
        Integer displaySize = tv1.getDisplaySize();

        System.out.println(make + " " + displaySize);
        System.out.println(tv2);
        System.out.println(tv3.description());
        System.out.println(tv3.equals(tv2)); //we have to write equals and hashcode methods to return true!!

/*        tv1.make = "Sony";
        tv1.displaySize = 55;

        tv2.make = "Samsung";
        tv2.displaySize = 48;

        System.out.println(tv1.make + " " + tv1.displaySize);
        System.out.println(tv2.make + " " + tv2.displaySize);*/
    }
}
