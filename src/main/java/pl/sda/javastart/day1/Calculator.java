package pl.sda.javastart.day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner oneScanner = new Scanner(System.in);
        System.out.println("Wprowadz pierwszą liczbę:");
        double a = oneScanner.nextDouble();
        System.out.println("Wprowadz drugą liczbę:");
        double b = oneScanner.nextDouble();

        double result = adder(a, b);
        System.out.println(result + " " + (a - b));

        System.out.println("a + b = " + (a + b)); //użycie bez metody
        System.out.println("a + b = " + adder(a, b));//użycie metody

        System.out.println("a * b = " + (a * b)); //użycie bez metody
        System.out.println("a * b = " + mutiplier(a, b));//użycie metody

        System.out.println("" + a + " + " + b + " = " + result);
        System.out.println("" + a + " - " + b + " = " + (a - b));
        System.out.println("" + a + " * " + b + " = " + (a * b));
        System.out.println("" + a + " / " + b + " = " + (a / b));
        System.out.println("" + a + " % " + b + " = " + (a % b));

        System.out.println(Math.abs(a - b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.pow(a, b));

        System.out.printf("Square: %6.2f\n", Math.pow(a, b));
        System.out.printf("Cube  : %6.2f\n", Math.pow(a, 3));
        System.out.printf("4 pow : %6.2f\n", Math.pow(a, 4));

    }

    public int add(int a, int b) {
        return a + b;
    }


    public static int adder(int a, int secondValue) {
        int result = a + secondValue;
        return result;
    }

    private static double adder(double a, double secondValue) {
        double result = a + secondValue;
        return result;
    }

    private static double mutiplier(double x, double y) {
        return x * y;
    }
}
