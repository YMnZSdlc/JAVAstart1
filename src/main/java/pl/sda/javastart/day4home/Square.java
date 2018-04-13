package pl.sda.javastart.day4home;

public class Square extends Figure{
    private Point p;
    private double side;

    public Square(Point p, double side) {
        this.p = p;
        this.side = side;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return (side*side);
    }

    @Override
    double getCircuit() {
        return (4*side);
    }

    @Override
    Point[] getEdges() {
        return new Point[0];
    }

    @Override
    public String toString() {
        return "Square{" +
                "p=" + p +
                ", side=" + side +
                '}';
    }
}
