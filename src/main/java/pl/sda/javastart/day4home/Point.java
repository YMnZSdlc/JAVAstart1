package pl.sda.javastart.day4home;

public class Point {
    private double xPoint;
    private double yPoint;

    public Point(double xP, double yP) {
        this.xPoint = xP;
        this.yPoint = yP;
    }

    public double calculateDisttance(Point otherPoint) {
        double partialResult = (xPoint - otherPoint.xPoint)*(xPoint - otherPoint.xPoint)+
                (yPoint - otherPoint.yPoint)*(yPoint - otherPoint.yPoint);
        partialResult = Math.sqrt(partialResult);
        return partialResult;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xPoint=" + xPoint +
                ", yPoint=" + yPoint +
                '}';
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


}
