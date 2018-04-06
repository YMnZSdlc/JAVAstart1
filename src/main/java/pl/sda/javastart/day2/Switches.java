package pl.sda.javastart.day2;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
<<<<<<< HEAD

        double a, b;

        Scanner in = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę: ");
        a = in.nextDouble();
        System.out.println("Wprowadź drugą liczbę: ");
=======
        calcSwitch();
    }

    public static void calcSwitch() {
        double a;
        double b;

        Scanner in = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        a = in.nextDouble();
        System.out.print("Wprowadź drugą liczbę: ");
>>>>>>> 1d736e1a694aeb0b069ef638d696ace52c658117
        b = in.nextDouble();

        System.out.println();
        System.out.println("Co chcesz zrobić?");
        System.out.println("1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie");
<<<<<<< HEAD
        int selection = in.nextInt();

        switch (selection) {
            case 1:
                System.out.println("" + a + "+" + b + "=" + (a + b));
                break;
            case 2:
                System.out.println("" + a + "-" + b + "=" + (a - b));
                break;
            case 3:
                System.out.println("" + a + "*" + b + "=" + (a * b));
                break;
            case 4:
                System.out.println("" + a + "/" + b + "=" + (a / b));
                break;
            default:
                System.out.println("Niepoprawny wybór");
        }

=======
        int wybor = in.nextInt();

        switch (wybor) {
            case 1:
                System.out.println("" + a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println("" + a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println("" + a + " * " + b + " = " + (a * b));
                break;
            case 4:
                System.out.println("" + a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Niepoprawny wybór!!!");
        }
>>>>>>> 1d736e1a694aeb0b069ef638d696ace52c658117
    }
}


