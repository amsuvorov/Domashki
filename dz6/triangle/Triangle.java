public class Triangle {
    double side1;
    double side2;
    double side3;
    double perimetre;
    double square;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        this.perimetre = side1 + side2 + side3;
        this.square = Math.sqrt((perimetre / 2) * (perimetre / 2 - side1) * (perimetre / 2 - side2) * (perimetre / 2 - side3));

    }


}

