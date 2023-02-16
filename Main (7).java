import java.util.Scanner;

public class Main {
    public static void godini(String[] args) {
        System.out.println("Введіть кількість робочих годин на тиждень");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        System.out.println("Введіть річну зарплатню з податками ");
        Scanner scan2 = new Scanner(System.in);
        double b = scan.nextInt();
        System.out.println("Введіть вісоток податку ");
        Scanner scan3 = new Scanner(System.in);
        double s = scan.nextInt();
        double y = (b + (b * (s / 100)));
        double d = (y / (a * 4 * 12));
        System.out.println("При " + a + " робочих годин на тиждень з річною зарплатею в " + b + "" +
                " та податком " + s + " % година часу коштує " + d);
    }
}