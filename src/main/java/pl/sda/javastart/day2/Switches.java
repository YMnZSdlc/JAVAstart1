package pl.sda.javastart.day2;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        calcSwitch();
    }

    public static void calcSwitch() {
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
        int selection = in.nextInt();


        switch (selection) {
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
    }
}


