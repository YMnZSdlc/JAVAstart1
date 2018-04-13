package pl.sda.javastart.day4home;

public class Point {
    private double xPoint;
    private double yPoint;

    public Point() {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public double getxPoint() {
        return xPoint;
    }

    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public double getyPoint() {
        return yPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xPoint=" + xPoint +
                ", yPoint=" + yPoint +
                '}';
    }
}
