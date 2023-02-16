import java.util.Scanner;

public class Main {
    public static void figura(String[] args) {
        int visota = Integer.parseInt(args[0]);
        int shirina = Integer.parseInt(args[1]);
        String text1 = "Введіть фігуру : 1 - прямокутник, 2- прямокутний трикутник, 3- зворотній прямокутний трикутник, 4-трикутник.";
        int want;
        do {
            System.out.println(text1);
            Scanner scan = new Scanner(System.in);
            int figura = scan.nextInt();
            switch (figura) {
                case 1:
                    for (int i = 0; i < visota; i++) {
                        for (int j = 0; j < shirina; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    for (int i = visota; i >= 0; i--) {

                        for (int j = i; j <= visota; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    for (int i = visota; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = i; j <= visota; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = visota; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = i; j <= visota; j++) {
                            System.out.print("  *");
                        }
                        System.out.println();
                    }
            }

            System.out.println("Вивести ще фігуру? Введіть цифру 1 якщо так, цифру 2 якщо ні.");
            Scanner scan2 = new Scanner(System.in);
            want = scan2.nextInt();
        } while (want != 2);
    }

}











