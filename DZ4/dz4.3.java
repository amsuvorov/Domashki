public class Main {
    public static void zarplata(String[] args) {

        int payHour = Integer.parseInt(args[0]);
        int rent = Integer.parseInt(args[1]);
        int days = 0;
        String month = String.valueOf(0);

        month = "Січень";
        days = 31;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Лютий";
        days = 28;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Березень";
        days = 30;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Квітень";
        days = 31;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Травень";
        days = 30;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Червень";
        days = 31;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Липень";
        days = 30;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Серпень";
        days = 31;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Вересень";
        days = 30;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Жовтень";
        days = 31;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Листопад";
        days = 30;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        month = "Грудень";
        days = 31;
        System.out.println(month + " Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println(month + " З податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
        days = 31 + 28 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31;
        System.out.println("...");
        System.out.println("За рік Без податків " + ((days - (days / 7 * 2)) * 8 * payHour));
        System.out.println("За рік з податками " + ((((days - (days / 7 * 2)) * 8 * payHour) - ((days - (days / 7 * 2)) * 8 * payHour) * rent / 100)));
    }
}
