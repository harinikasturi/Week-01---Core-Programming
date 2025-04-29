import java.util.Scanner;

class Problem9 {
    public static void printCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayOfWeek = getFirstDayOfMonth(month, year);

        System.out.println("\n   " + months[month-1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth[month-1]; day++) {
            System.out.printf("%2d ", day);
            if ((day + dayOfWeek) % 7 == 0 || day == daysInMonth[month-1]) {
                System.out.println();
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

    private static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}