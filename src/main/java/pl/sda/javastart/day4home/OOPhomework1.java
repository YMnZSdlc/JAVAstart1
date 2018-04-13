package pl.sda.javastart.day4home;

public class OOPhomework1 {
    public static void main(String[] args) {
        Point punktKola = new Point();
        Circle kolo = new Circle(punktKola,2);
        System.out.println(kolo.getArea());

        punktKola.setyPoint(5.65);
        punktKola.setxPoint(6.54);


        Rectangle prostokat = new Rectangle(punktKola,4,6);
        System.out.println(prostokat.getArea());
        System.out.println(prostokat.getCircuit());

        System.out.println(prostokat.toString());



    }
}
