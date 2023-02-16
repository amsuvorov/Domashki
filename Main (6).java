public class Main {
    public static void zarplatnia(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int s = Integer.parseInt(args[2]);
        double i = (a * b * 4); // Зарплатня на місяць без податків
        double t = (i - (i / 100 * s)); // Зарплатня на місяць з податками
        double u = (i * 12); // Зарплатня на рік без податків
        double y = (t * 12); // Зарплатня на рік з податками


        System.out.println("Зарплатня на місяць без податків: " + i);
        System.out.println("Зарплатня на місяць з податками: " + t);
        System.out.println("Зарплатня на рік без податків: " + u);
        System.out.println("Зарплатня на рік з податками: " + y);
    }
}