package pl.sda.javastart.day4home;

public class Circle extends Figure{
    private Point p;
    private double r;



    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return (Math.PI*Math.pow(r,2));
    }

    @Override
    double getCircuit() {
        return (2*Math.PI*r);
    }

    @Override
    Point[] getEdges() {
        return new Point[0];
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }
}
