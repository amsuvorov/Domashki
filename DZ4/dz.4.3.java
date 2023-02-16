import java.util.Scanner;

public class Main {
    public static void kredit(String[] args) {
        System.out.println("Введіть суму Кредиту");
        Scanner scan = new Scanner(System.in);
        double obSum = scan.nextInt();
        
        System.out.println("Введіть відсоток на залішок");
        Scanner scan2 = new Scanner(System.in);
        double vidst = scan2.nextInt();
        
        System.out.println("Якщо бажаєте розрахувати кількість платежів натисніть -1,якщо сумму одного платежа натисніть -2.");
        Scanner scan3 = new Scanner(System.in);
        
        int vibor;
        vibor = scan3.nextInt();

        switch (vibor) {
            case 1:
                System.out.println("Введіть суму одного платежа");
                Scanner scan5 = new Scanner(System.in);
                double mPlt = scan5.nextInt();
                double kilp = ((obSum / mPlt * (mPlt / vidst)));
                System.out.println("Кількусть платежів " + kilp);
                break;

            case 2:
                System.out.println("Введіть кількусть платежів");
                Scanner scan6 = new Scanner(System.in);
                double kil = scan6.nextInt();
                double misP = (((obSum - (obSum / kil)) * (vidst / kil) + obSum) / kil);
                System.out.println("Сумма одного платежу " + misP);
                break;
        }

    }
}
