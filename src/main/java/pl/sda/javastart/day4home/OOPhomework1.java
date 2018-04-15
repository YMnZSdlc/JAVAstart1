package pl.sda.javastart.day4home;

import java.util.Arrays;

public class OOPhomework1 {
    public static void main(String[] args) {

        Point punkt1 = new Point(0,0);
        Point punkt2 = new Point(3,0);
        Point punkt3 = new Point(0,3);
        Point punkt4 = new Point(3,3);

        Square kwadrat = new Square(punkt1,punkt2,punkt3,punkt4);
        System.out.println(kwadrat.getArea());
        System.out.println(kwadrat.getCircuit());
        System.out.println(Arrays.toString(kwadrat.getEdges()));
        System.out.println(kwadrat.toString());


//        Point punktKola = new Point(6,7);
//        Circle kolo = new Circle(punktKola,2);
//        System.out.println(kolo.getArea());
//        System.out.println(kolo.getCircuit());
//
//
//        Rectangle prostokat = new Rectangle(punktKola,4,6);
//        System.out.println(prostokat.getArea());
//        System.out.println(prostokat.getCircuit());
//
//        System.out.println(prostokat.toString());
    }
}
