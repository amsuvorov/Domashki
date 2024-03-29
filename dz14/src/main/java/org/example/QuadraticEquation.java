package org.example;

public class QuadraticEquation  {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double solve() {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Рівняння " + a + "x^2 + " + b + "x + " + c + " = 0 має корені: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Рівняння " + a + "x^2 + " + b + "x + " + c + " = 0 має єдиний корінь: ");
            System.out.println("x = " + x);
        } else {
            System.out.println("Рівняння " + a + "x^2 + " + b + "x + " + c + " = 0 не має дійсних коренів.");
        }

        return discriminant;
    }
}
