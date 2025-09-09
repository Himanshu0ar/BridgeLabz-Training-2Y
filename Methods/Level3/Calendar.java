import java.util.*;

public class Calendar {
    public static String getMonthName(int m) {
        String[] months = {"January","February","March","April","May","June","July",
                           "August","September","October","November","December"};
        return months[m-1];
    }

    public static int getDays(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && ((y%4==0 && y%100!=0) || y%400==0)) return 29;
        return days[m-1];
    }

    public static int getFirstDay(int m, int y) {
        int d = 1, mm = m, yy = y;
        if (mm < 3) { mm += 12; yy--; }
        int k = yy % 100, j = yy / 100;
        int h = (d + (13*(mm+1))/5 + k + (k/4) + (j/4) + (5*j)) % 7;
        return (h+6)%7; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), y = sc.nextInt();
        System.out.println("\n" + getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int fd = getFirstDay(m,y), days = getDays(m,y);
        for (int i = 0; i < fd; i++) System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + fd) % 7 == 0) System.out.println();
        }
    }
}
