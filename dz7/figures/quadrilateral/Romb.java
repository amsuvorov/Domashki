package figures.quadrilateral;

import figures.Figures;

public class Romb extends Figures {
    private double side1;
    private double side2;
    private double side3;
    private double side4;
    private double dopGradus;
    private double corner1;

    public double getCorner1() {
        return corner1;
    }

    public Romb(double side1, double dopGradus) {
        this.side1 = side1;
        this.side2 = side1;
        this.side3 = side1;
        this.side4 = side1;
        this.dopGradus = dopGradus;
        this.corner1 = dopGradus + 90;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side1;
    }

    public double getSide3() {
        return side1;
    }

    public double getSide4() {
        return side1;
    }
}
