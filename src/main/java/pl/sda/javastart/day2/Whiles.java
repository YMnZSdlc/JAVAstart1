package pl.sda.javastart.day2;

import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {
        whileBasics();
        doWhileBasics();
    }

    private static void whileBasics() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Wprowadź ilość pozdrowieniń: ");
        double howManyTimes = skaner.nextDouble();

        int i = 0;
        while (i < howManyTimes){
            System.out.println("Cześć. Tu pętla"+ i);
            i++;
        }
    }

    private static void doWhileBasics() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Wprowadź ilość pozdrowieniń: ");
        double howManyTimes = skaner.nextDouble();

        int i = 0;
        do {
            System.out.println("Cześć. Tu pętla" + i);
            i++;
        }
        while (i < howManyTimes);
    }
}
