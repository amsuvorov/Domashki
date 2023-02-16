import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price = Integer.parseInt(args[0]);
        System.out.println("Введіть кількість товарy");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextInt();
        if (number <= 10) {
            double topay = (price * number);
            System.out.println("До сплати " + topay);
        } else if (number > 10 & number < 21) {
            double topay1 = (price * 0.95 * number);
            System.out.println("До сплати " + topay1);
        } else if (number > 20 & number < 31) {
            double topay2 = (price * 0.90 * number);
            System.out.println("До сплати " + topay2);
        } else if (number > 30 & number < 41) {
            double topay3 = (price * 0.88 * number);
            System.out.println("До сплати " + topay3);
        } else if (number > 40 & number < 51) {
            double topay4 = (price * 0.876 * number);
            System.out.println("До сплати " + topay4);
        } else if (number > 50 & number < 61) {
            double topay5 = (price * 0.872 * number);
            System.out.println("До сплати " + topay5);
        } else if (number > 60 & number < 71) {
            double topay6 = (price * 0.868 * number);
            System.out.println("До сплати " + topay6);
        } else if (number > 70 & number < 81) {
            double topay7 = (price * 0.864 * number);
            System.out.println("До сплати " + topay7);
        } else if (number > 80) {
            double topay8 = ((price * number) * 0.87);
            System.out.println("До сплати " + topay8);
        }


    }
}