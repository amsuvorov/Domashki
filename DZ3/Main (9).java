import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть число");
        Scanner scan = new Scanner(System.in);
        int chislo = scan.nextInt();
        if (chislo % 2 == 0) {
            System.out.println("Парне");
        } else {
            System.out.println("Непарне");
        }
        if (chislo > 0) {
            System.out.println("Додатнє");
        } else {
            System.out.println("Від'ємне");
        }

        for (int i = 2; i < chislo; i++)
            if (chislo % i == 0) {
                System.out.println("Складене");
                break;
            } else {
                System.out.println("Просте");
                break;
            }

    }
}