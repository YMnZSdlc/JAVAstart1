package pl.sda.javastart.day1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner oneScanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: ");
        double a = oneScanner.nextDouble();
        System.out.println("Wprowadź drugą liczbę: ");
        double b = oneScanner.nextDouble();

        System.out.println("" + a + " + " + b + " = " + addDouble(a, b));
        System.out.println("" + a + " - " + b + " = " + subtract(a, b));
        System.out.println("" + a + " * " + b + " = " + multiplier(a, b));
        System.out.println("" + a + " / " + b + " = " + (a / b));
        System.out.println("" + a + " % " + b + " = " + (a % b));

        System.out.println("Wartość minimalana podanych zmiennych " + Math.min(a, b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.abs(a - b));
        System.out.println(Math.pow(a, b));
    }

    public static int addIntiger(int ax, int bx) {
        return ax + bx;
    }

    public static double addDouble(double ay, double by) {
        double cy = ay + by;
        return cy;
    }

    public static double multiplier(double a, double b) {
        return a * b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
}
