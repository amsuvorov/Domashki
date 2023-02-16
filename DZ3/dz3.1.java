import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void chislo(String[] args) {
        System.out.println("Введіть число");
        Scanner scan = new Scanner(System.in);
        int chislo = scan.nextInt();
        if (chislo % 2 == 0) {
            System.out.println("Парне");
        } else {
            System.out.println("Непарне");
        }
        if (chislo > 1) {
            System.out.println("Додатнє");
        } else if (chislo < -1) {
            System.out.println("Від'ємне");
        }
        Integer integer = chislo;
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        if (probablePrime) {
            System.out.println("Просте");
        } else {
            System.out.println("Складне");
        }
    }
}
