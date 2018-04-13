package pl.sda.javastart.day4home;

public class Rectangle extends Figure {
    private Point p;
    private double width;
    private double height;

    public Rectangle(Point p, double width, double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight() {
         return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    @Override
    double getArea(){
        return height*width;
    }

    @Override
    double getCircuit(){
        return (2*height+2*width);
    }

    @Override
    Point[] getEdges(){
        return new Point[0];
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "p=" + p +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
