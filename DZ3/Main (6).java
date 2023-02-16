public class Main {
    public static void main(String[] args) {
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

       /* String days [] = new String[31];
        days[0] = 8;
        days[1] = 8;
        days[2] = 8;
        days[3] = 8;
        days[4] = 8;
        days[5] = 0;
        days[6] = 0;
        days[7] = 8;
        days[8] = 8;
        days[9] = 8;
        days[10] = 8;
        days[11] = 8;
        days[12] = 0;
        days[13] = 0;
        days[14] = 8;
        days[15] = 8;
        days[16] = 8;
        days[17] = 8;
        days[18] = 8;
        days[19] = 0;
        days[20] = 0;
        days[21] = 8;
        days[22] = 8;
        days[23] = 8;
        days[24] = 8;
        days[25] = 8;
        days[26] = 0;
        days[27] = 0;
        days[28] = 8;
        days[29] = 8;
        days[30] = 8;
        System.out.println(days[28]);

        */

    }
}