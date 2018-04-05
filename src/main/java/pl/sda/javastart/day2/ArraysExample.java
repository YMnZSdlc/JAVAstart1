package pl.sda.javastart.day2;

import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        printNameWithComma();
    }

    private static void printNameWithComma() {
        Scanner scanerName = new Scanner(System.in);

        String[] names = new String[5];

        int i = 0;
        do {
            System.out.println("Podaj kolejne imię: ");
            String name = scanerName.nextLine();
            names[i] = name;
            i++;
        } while (i < 5);
        int a = 0;
        for (String mane : names) {
            System.out.println(mane + (a < names.length - 1 ? ", " : ""));
            a++;
        }
    }
}
