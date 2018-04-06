package pl.sda.javastart.day2;

import java.util.Scanner;

public class Ifs {

    public static void main(String[] args) {
        boolean result = positiveOrNot(-3);
        System.out.println("Czy liczba -3 jest większa od zera?" + result);
        boolean anotherResult = positiveOrNot(5);
        System.out.println("Czy liczba 5 jest większa od zera?" + anotherResult);

        answerCall(true, true, true);
        answerCall(false, false, false);
        answerCall(true, true, false);
        answerCall(false, true, false);


    }

    public static boolean positiveOrNot(int value) {
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean answerCall(boolean isMama, boolean isMorning, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && !isMama) {
            return false;
        }
        return true;
    }

    public static int checkWhichOneIsBigger(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void checkWhichOneIsBiggerMast(int a, int b) {
        if (a > b) {
            System.out.println("Pierwsza liczba jest większa");
        } else if (b > a) {
            System.out.println("Pierwsza druga jest większa");
        } else System.out.println("Liczby są równe");
    }


    private void calcIfs() {
        double a;
        double b;

        Scanner in = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        a = in.nextDouble();
        System.out.print("Wprowadź drugą liczbę: ");
        b = in.nextDouble();

        System.out.println();
        System.out.println("Co chcesz zrobić?");
        System.out.println("1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie");
        int wybor = in.nextInt();

        if (wybor == 1) {
            System.out.println("" + a + " + " + b + " = " + (a + b));
        } else if (wybor == 2) {
            System.out.println("" + a + " - " + b + " = " + (a - b));
        } else if (wybor == 3) {
            System.out.println("" + a + " * " + b + " = " + (a * b));
        } else if (wybor == 4) {
            System.out.println("" + a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Niepoprawny wybór!!!");
        }
    }


}
