public class Main {
    public static void zarplata(String[] args) {
        int month = Integer.parseInt(args[0]);
        int payHour = Integer.parseInt(args[1]);
        int rent = Integer.parseInt(args[2]);
        int days = 0;
        if (month == 1) {
            days = 31;
        } else if (month == 2) {
            days = 28;
        } else if (month == 3) {
            days = 30;
        } else if (month == 4) {
            days = 31;
        } else if (month == 5) {
            days = 30;
        } else if (month == 6) {
            days = 31;
        } else if (month == 7) {
            days = 30;
        } else if (month == 8) {
            days = 31;
        } else if (month == 9) {
            days = 30;
        } else if (month == 10) {
            days = 31;
        } else if (month == 11) {
            days = 30;
        } else if (month == 12) {
            days = 31;
        }

        int salary = (days - (days / 7 * 2)) * 8 * payHour;
        System.out.println("Місячна зарплата без податків " + salary);
        System.out.println("Місячна зарплата з податками " + (salary - (salary * rent / 100)));

     
    }
}
