package figures.quadrilateral;

public class Rectangle extends Quadrilateral {
    private double side1;
    private double side2;
    private double side3;
    private double side4;
    private double corner1 = 90;
    private double corner2 = 90;
    private double corner3 = 90;
    private double corner4 = 90;

    public double getCorner1() {
        return corner1;
    }

    public double getCorner2() {
        return corner2;
    }

    public double getCorner3() {
        return corner3;
    }

    public double getCorner4() {
        return corner4;
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

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side1;
        this.side4 = side2;
    }
}


