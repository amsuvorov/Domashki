package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть коефіцієнти a, b та c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquations quadraticEquations = new QuadraticEquations(a, b, c);

            Root root = quadraticEquations.getRoots();

            System.out.println(root.toString());
        }
    }