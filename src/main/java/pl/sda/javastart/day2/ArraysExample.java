package pl.sda.javastart.day2;

import java.util.Arrays;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class ArraysExample {
    public static void main(String[] args) {
//        printNameWithComma();
//        sumElementsOfArray();
        printNumberInTowerRows(5);
//        printEmptyArray(3, 5);
        sumElementsInArray(new int[]{1, 2, 3});
    }

    //public boolean compareArray
    //do skopiowania z Gita


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

    public static void printEmptyArray(int arraySize, int elements) {
        int[] arrays = new int[arraySize < elements ? elements : arraySize];

        for (int i = 0; i < elements; i++) {
            arrays[i] = 7;
        }
        for (int array : arrays) {
            System.out.println(array);
        }
    }


    public static void sumElementsInArray(int[] array) {
        int sumOfArrayElements = 0;

//        for (int i=0; i<array.length;i++) {
//            sumOfArrayElements += array[i];
//        }

        for (int element : array) {
            sumOfArrayElements += element;
        }
        System.out.println(sumOfArrayElements);

        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

    }


    private static void sumElementsOfArray() {
        /*
        TASK 1
        Napisz program pobierający od użytkownika 10 różnych
        liczb całkowitych za pomocą pętli for,
      • Po zakończeniu pobierania wypisz sumę oraz średnią
        wszystkich pobranych liczb.
      • (dodatkowo) Wypisz najmniejszą oraz największą z
        podanych przez użytkownika liczb.
    */
        Scanner scanerName = new Scanner(System.in);
        int[] naturalNumbers = new int[10];
        int i = 0;
        do {
            System.out.println("Podaj kolejną liczbę naturalną: ");
            int number = scanerName.nextInt();
            naturalNumbers[i] = number;
            i++;
        } while (i < 10);
        int sum = 0;
        for (int j = 0; j < 10; j++) {
            sum += naturalNumbers[j];
        }
        System.out.println("Suma podanych liczb to: " + sum);
        System.out.println("Średnia z podanych liczb to: " + (sum / 10));

    }


    public static void printNumberInTowerRows(int n) {
        /*
        TASK 2
        printNumbersInTower
        1
        12
        123
        printNumbersInTowerSameInRows
        1
        22
        333
        */
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
