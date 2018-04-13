package pl.sda.javastart.day4home;

public abstract class Figure {

    abstract double getArea();
    abstract double getCircuit();
    abstract  Point[] getEdges();



    @Override
    public String toString() {
        return "Figure{}";
    }
}
