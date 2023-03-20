class Quadratian extends Figures {
    private double a;

    public Quadratian(double a) {
        this.a = a;
    }

    @Override
    public double square() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return String.format("[Quadratian]: Square = %.2f Perimeter = %.2f", square(), perimeter());
    }
}