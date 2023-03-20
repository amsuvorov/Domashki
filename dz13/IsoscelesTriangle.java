class IsoscelesTriangle extends Figures {
    private double a, b, c;

    public IsoscelesTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double square() {
        double p = perimeter() / 2;
        double h = 2 * Math.sqrt(p * (p - b) * (p - c) * (p - a)) / a;
        return a / 2 * h;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return String.format("[IsoscelesTriangle]: Square = %.2f Perimeter = %.2f", square(), perimeter());
    }
}