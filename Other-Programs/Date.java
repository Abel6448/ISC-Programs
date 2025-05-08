package Class12;

import java.util.Scanner;

public class Date {
    int day, year;

    void getandcheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day:");
        day = sc.nextInt(); // Use instance variable
        System.out.println("Enter the Year:");
        year = sc.nextInt(); // Use instance variable

        int feb = 0;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            feb = 29;
        } else {
            feb = 28;
        }

        finddate(day, year);
    }

    void finddate(int day, int year) {
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthname = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // Adjust for leap year
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            month[2] = 29;
        }

        int m = 1;
        while (day > month[m]) {
            day -= month[m];
            m++;
        }

        String prefix = "";
        if (day % 10 == 1 && day != 11) {
            prefix = "st";
        } else if (day % 10 == 2 && day != 12) {
            prefix = "nd";
        } else if (day % 10 == 3 && day != 13) {
            prefix = "rd";
        } else {
            prefix = "th";
        }

        System.out.println(day + prefix + " " + monthname[m]);
    }

    void extradays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the extra days:");
        int n = sc.nextInt();
        while (n <= 0 || n >= 100) {
            System.out.println("Please enter a value between 1 and 99:");
            n = sc.nextInt();
        }

        int newday = day + n;
        finddate(newday, year);
    }

    public static void main(String[] args) {
        Date d = new Date();
        d.getandcheck();
        d.extradays();
    }
}
