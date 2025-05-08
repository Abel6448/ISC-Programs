package Class12;

import java.util.*;

public class ConsecutiveAdd {
    int num;

    public void getnum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = sc.nextInt();
        if(num<3) {
        	System.out.println("INVALID INPUT!!");
        	System.exit(0);
        }
        System.out.println("\nThe Combinations Are: ");
        for (int i = 1; i <= num / 2; i++) {
            int sum = 0;
            String sum1 = "";
            int x = i;

            while (sum < num) {
                sum += x;
                sum1 += x + "+";
                x++;
            }

            if (sum == num) {
            	System.out.println();
                System.out.println(sum1.substring(0, sum1.length() - 1));
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        ConsecutiveAdd c = new ConsecutiveAdd();
        c.getnum();
    }
}
