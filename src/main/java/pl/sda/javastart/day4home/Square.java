package pl.sda.javastart.day4home;

public class Square extends Figure {

    Point p1;
    Point p2;
    Point p3;
    Point p4;

    public Square(Point point1, Point point2, Point point3, Point point4) {
        this.p1 = point1;
        this.p2 = point2;
        this.p3 = point3;
        this.p4 = point4;
    }

    @Override
    double getArea() {
        double side = p1.calculateDisttance(this.p2);

        return (Math.pow(side, 2));
    }

    @Override
    double getCircuit() {
        double side = p1.calculateDisttance(p2);
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                '}';
    }

    @Override
    Point[] getEdges() {
        return new Point[]{p1, p2, p3, p4};
    }

}
