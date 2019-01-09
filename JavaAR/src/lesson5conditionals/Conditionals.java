package lesson5conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        System.out.println("***If***");

        StringBuilder name = new StringBuilder();
        name.append("Ja");
        name.append("nek");
        String name2 = "Kasia";

        if (name.equals("Jan") || name2.equals("Kasia")) {
            System.out.println("Hi " + name + ", hi " + name2);
        }

        System.out.println("***Switch case***");
        System.out.print("Choose the number: ");
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();

        switch (x) {
            case 1:
                showNumber(x);
                break;
            case 2:
                showNumber(x);
                break;
            case 3:
                showNumber(x);
                break;
            default:
                System.out.println("Try with other number!");
                break;

        }
        if (x == 4) {
            System.out.println("X = 4");
        }
    }

    public static void showNumber(int x) {
        System.out.println("Your number is " + x);
    }
}
