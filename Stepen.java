public class Stepen {
    public static void stepin(String[] args) {

   int a = Integer.parseInt(args[0]);
   int b = Integer.parseInt(args[1]);
    System.out.printf ("Число " + args[0] + " в " + args[1] + " степені буде %.0f\n", +Math.pow(a, b));

    }
}
