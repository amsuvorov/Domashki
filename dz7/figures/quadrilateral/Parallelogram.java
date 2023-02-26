package figures.quadrilateral;

public class Parallelogram extends Quadrilateral {
    private double side1;
    private double side2;
    private double side3;
    private double side4;
    private double dopGradus;
    private double corner1;

    public double getCorner1() {
        return corner1;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getSide4() {
        return side4;
    }

    public Parallelogram(double side1, double side2, double dopGradus) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side1;
        this.side4 = side2;
        this.dopGradus = dopGradus;
        this.corner1 = dopGradus + 90;
    }
}
