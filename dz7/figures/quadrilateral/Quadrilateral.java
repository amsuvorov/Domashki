package figures.quadrilateral;

import figures.Figures;

public class Quadrilateral extends Figures {
    private double corner1;
    private double corner2;
    private double corner3;
    private double corner4;

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

    public void setCorner1(double corner1) {
        this.corner1 = corner1;
    }

    public void setCorner2(double corner2) {
        this.corner2 = corner2;
    }

    public void setCorner3(double corner3) {
        this.corner3 = corner3;
    }

    public void setCorner4(double corner4) {
        this.corner4 = corner4;
    }
}
