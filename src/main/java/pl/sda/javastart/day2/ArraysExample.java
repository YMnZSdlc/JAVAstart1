package pl.sda.javastart.day2;

import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        printNameWithComma();
    }

    private static void printNameWithComma() {
        Scanner cin = new Scanner(System.in);

        String[] names = new String[5];

        int i = 0;
        do {
            System.out.println("Podah kolejne imię: ");
            String name = cin.nextLine();
            names[i] = name;
            i++;
        } while (i < 5);

        //for (String name : names) System.out.print(name + (names.length - 1 < a ?));
    }
}
