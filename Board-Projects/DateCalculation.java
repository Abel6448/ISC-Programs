package BoardPrograms;

import java.util.*;

public class DateCalculation {

    int day, month, year, n;

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Accept input
        System.out.print("Enter day (DD): ");
        day = sc.nextInt();

        System.out.print("Enter month (MM): ");
        month = sc.nextInt();

        System.out.print("Enter year (YYYY): ");
        year = sc.nextInt();

        System.out.print("Enter number of days (N): ");
        n = sc.nextInt();

        // Validate inputs
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1 || n < 1) {
            System.out.println("Invalid input!");
            return;
        }

        // Call method to calculate the resulting date
        calculateDate();
    }

    public void calculateDate() {
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Validate day within the specified month
        if (day > daysInMonth[month - 1]) {
            System.out.println("Invalid input!");
            return;
        }

        // Adjust the number of days to include the date of allotment
        n--; 

        // Add the number of days (N-1) to the given date
        day += n;

        // Adjust month and year if day exceeds the current month
        while (day > daysInMonth[month - 1]) {
            day -= daysInMonth[month - 1];
            month++;

            // If month exceeds 12, adjust year
            if (month > 12) {
                month = 1;
                year++;
                daysInMonth[1] = isLeapYear(year) ? 29 : 28; // Update February for the new year
            }
        }

        // Display the resulting date
        System.out.println("\nThe project submission date is: " + day + "/" + month + "/" + year);

    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        DateCalculation dc = new DateCalculation();
        dc.input();
    }
}
