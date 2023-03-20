import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figures> figures = new ArrayList<>();
        boolean continueAdding = true;

        while (continueAdding) {
            System.out.print("Яку фігуру ви хочете додати (Triangle, Circle, IsoscelesTriangle, Quadratian)? ");
            String figureType = scanner.nextLine();

            switch (figureType) {
                case "Triangle":
                    System.out.print("Введіть довжини сторін трикутника через пробіл (наприклад 3 4 5): ");
                    String[] triangleSides = scanner.nextLine().split(" ");
                    if (triangleSides.length == 3) {
                        double a = Double.parseDouble(triangleSides[0]);
                        double b = Double.parseDouble(triangleSides[1]);
                        double c = Double.parseDouble(triangleSides[2]);
                        figures.add(new Triangle(a, b, c));
                    } else {
                        System.out.println("Помилка при введенні сторін трикутника");
                    }
                    break;
                case "Circle":
                    System.out.print("Введіть радіус кола: ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    figures.add(new Circle(radius));
                    break;
                case "IsoscelesTriangle":
                    System.out.print("Введіть довжини сторін равнобедренного трикутника через пробіл (наприклад 3 4 4): ");
                    String[] isoscelesTriangleSides = scanner.nextLine().split(" ");
                    if (isoscelesTriangleSides.length == 3) {
                        double a2 = Double.parseDouble(isoscelesTriangleSides[0]);
                        double b2 = Double.parseDouble(isoscelesTriangleSides[1]);
                        double c2 = Double.parseDouble(isoscelesTriangleSides[2]);
                        figures.add(new IsoscelesTriangle(a2, b2, c2));
                    } else {
                        System.out.println("Помилка при введенні сторін равнобедренного трикутника");
                    }
                    break;
                case "Quadratian":
                    System.out.print("Введіть довжину сторони квадрату: ");
                    double a3 = scanner.nextDouble();
                    scanner.nextLine();
                    figures.add(new Quadratian(a3));
                    break;
                default:
                    System.out.println("Неправильний ввід, спробуйте ще раз");
                    break;
            }

            System.out.print("Чи бажаєте ви продовжити (yes/no)? ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                continueAdding = false;
            }
        }

        scanner.close();

        Collections.sort(figures, Comparator.comparingDouble(Figures::square).thenComparingDouble(Figures::perimeter));

        System.out.println("============= Figure list: ===============");
        for (int i = 0; i < figures.size(); i++) {
            System.out.println((i + 1) + ". " + figures.get(i).toString());
        }
    }
}