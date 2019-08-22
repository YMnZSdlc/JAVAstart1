package pl.sda.javastart.day2;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Fors {
    public static void main(String[] args) {
        printFewNaturalNumbCubes(3, 7);
        contdown(20);
        countdownWithPlusPlus(20);
        System.out.println("printFew");
        naturalNumberDevidedByTwo(1, 10);
        System.out.println(printFewNaturalNumbersWithResultInString(2, 7, (x) -> (Math.pow((double) x, 3))));
        System.out.println(printFewNaturalNumbersWithResultInString(2, 7, (x) -> (Math.pow((double) x, 2))));
//        printFewNaturalNumbersWithTheirCubes(2, 7);
        exerciseFor(5);
        exerciseWhile(6);
        exerciseDoWhile(7);

    }

    public static void exerciseFor(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Ćwiczenie pętli \"for\". To jest pętla " + (i+1) + " z " + n);
        }
        System.out.println("Koniec pętli");
    }

    public static void exerciseWhile(int n) {
        int i=0;
        while (i<n){
            i++;
            System.out.println("Ćwiczenie pętli \"while\". To jest pętla " + i + " z " + n);
        }
        System.out.println("Koniec pętli");
    }

    public static void exerciseDoWhile(int n) {
        int counter=0;
        do {

            counter++;
//            if(counter<4)continue;
            System.out.println("Ćwiczenie pętli \"while\". To jest pętla " + counter + " z " + n);
        }
        while (counter<n);
        System.out.println("Koniec pętli");
    }

    public static void exerciseForEach() {

    }

    public static void countdownWithPlusPlus(int max) {
        for (int i = 0; i < max; i++) {
            System.out.println("Do końca zostało " + (max - i));
        }
    }

    public static void tenTimesHelloWorld() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World ! " + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World !! " + (i + 1));
        }
    }

    public static void printFewbaturalNumbersEvenWithStream(int min, int max) {
        IntStream.range(min, max + 1).filter(element -> element % 2 == 0).forEach(e -> System.out.println(e));
        // dziwny sposób na wypisanie liczb do wyjaśnienia
    }

    public static void printFewbaturalNumbersEvenWithContinue(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) { //jeśli reszta z dzielenia przez 2 różna od zero to:
                continue; //przechodzi dalej
            }
            System.out.println(i);
        }
    }

    public static void printFewNaturalNumbersEven(int min, int max) {
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    public static void printFewNaturalNumbersScaner() {

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

    public static void printFewNaturalNumbers(int min, int max) {
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

    public static void contdownWithPlusPlus(int max) {
        for (int i = 0; i < max; i++) {
            System.out.println("Do końca zostało" + (max - i));
        }
    }

    public static void naturalNumberDevidedByTwo(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumAndShowStatistics() {
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

    //tzw ciekawostka
    public static String printFewNaturalNumbersWithResultInString(int min, int max, Function<Double, Double> function) {
        String result = "";
        for (int i = min; i <= max; i++) {
            result = result + function.apply((double) i) + " ";
        }
        return result;
    }

    public static void fibonaci(int numerOfElement) {
        int element1 = 0;
        int element2 = 0;
        int sumOfElement;
        for (int i = 1; i < numerOfElement; i++) {
            System.out.println(element2);
            sumOfElement = element1 + element2;
            element1 = element2;
            element2 = sumOfElement;
        }


    }
}