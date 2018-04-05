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
//        System.out.println(printFewNaturalNumbersWithResultInString(2, 7, (x) -> (Math.pow((double) x, 3))));
//        System.out.println(printFewNaturalNumbersWithResultInString(2, 7, (x) -> (Math.pow((double) x, 2))));
//        printFewNaturalNumbersWithTheirCubes(2, 7);

    }


    public static void countdownWithPlusPlus (int max){
        for (int i=0; i<max; i++){
            System.out.println("Do końca zostało " + (max - i));
        }
    }

    public static void tenTimesHelloWorld() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World ! " + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World !! " + (i+1));
        }
    }

    public static void printFewbaturalNumbersEvenWithStream(int min, int max) {
        IntStream.range(min, max+1).filter(element -> element %2 ==0).forEach(e -> System.out.println(e));
    }

    public static void printFewbaturalNumbersEvenWithContinue(int min, int max) {
        for (int i = min; i <=max ; i++) {
            if (i % 2 !=0){
                continue;
            }
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

    public static void printFewNaturalNumb (int min, int max) {
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


}