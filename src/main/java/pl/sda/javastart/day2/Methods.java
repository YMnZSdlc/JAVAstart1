package pl.sda.javastart.day2;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner scanKey = new Scanner(System.in);
        System.out.println("Podaj długość prostokąta: ");
        double a = scanKey.nextDouble();
        System.out.println("Podaj szerokość prostokąta: ");
        double b = scanKey.nextDouble();

        System.out.println("Pole: " + areaRect(a, b));
        System.out.println("Obwód: " + circRect(a, b));

        System.out.println("Podaj liczbę przynajmniej 3 cefrową: ");

    }

    public static double areaRect(double a, double b) {
        return a * b;
    }

    public static double circRect(double a, double b) {
        return 2 * a + 2 * b;
    }

    public static double inchToMeter(double a){
        return a*0.0254;
    }

    public static int minutesToDateValue (int a){
        int y=0;
        return y;
    }

    public static double bmi (double weight, double height){
        return weight/ Math.pow(height, 2);
    }
}
