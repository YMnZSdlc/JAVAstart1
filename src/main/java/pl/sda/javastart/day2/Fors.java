package pl.sda.javastart.day2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Fors {
    public static void main(String[] args) {
        printFewNaturalNumbCubes(3, 7);

        contdown(9);

        naturalNumberDevidedByTwo(1, 10);

    }


    public static void tenTimesHelloWorls() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World ! " + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World !! " + i);
        }
    }

    public static void printFewNaturalNumbers() {

        int a;
        int b;

        Scanner in = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        a = in.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        b = in.nextInt();
        System.out.println("Liczby naruralne z podanego zakresu:");
        for (int i = a; i <= b; i++) {
            System.out.print(i + ", ");
        }
    }

    public static void printFewNaturalNumb(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public static void printFewNaturalNumbCubes(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i + " - jej sześcian = " + Math.pow(i, 2));
        }
    }

    public static void contdown(int start) {
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
            if (i == 0) System.out.println("BOOM");
        }
    }

    public static void naturalNumberDevidedByTwo(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumAndShowStatistics(){
        int a;
        int b;
        int c;

        Scanner in = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        a = in.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        b = in.nextInt();
        System.out.print("Wprowadź trzecią liczbę: ");
        c = in.nextInt();
        System.out.println("Liczb");

    }



}