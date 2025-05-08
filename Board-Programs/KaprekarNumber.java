package Class12;

import java.util.*;


public class KaprekarNumber {
    private int p,q;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Lower Limit(p): ");
        p = sc.nextInt();
        System.out.print("Enter The Upper Limit(q): ");
        q = sc.nextInt();
        if (p >= q || p < 0) {
            System.out.print("\nINVALID INPUT");
            System.exit(0);
        } else {
            display();
        }
        sc.close();
    }

    public boolean isKaprekar(int num) {
        int sq = num * num;
        String s = "0" + sq;
        int l = s.length();

        for (int i = 1; i < l; i++) {
            int lh = Integer.parseInt(s.substring(0, i));
            int rh = Integer.parseInt(s.substring(i));
            if (rh != 0 && (lh + rh) == num) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println();
        System.out.println("THE KAPREKAR NUMBERS ARE: ");
        int cnt = 0;
        for (int i = p; i <= q; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + ",");
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.print("There are no Kaprekar Numbers in this Range");
        }
        System.out.println("\nTHE FREQUENCY OF KAPREKAR NUMBERS ARE: " + cnt);
    }

    public static void main(String[] args) {
        KaprekarNumber kn = new KaprekarNumber();
        kn.input();
    }
}
			
		/*input Method
Start.
Create a Scanner object to take user input.
Prompt and read the lower limit (m).
Prompt and read the upper limit (n).
If m >= n or m < 0, print "INVALID INPUT" and exit the program.
Otherwise, call the display method.
End.

isKaprekar Method
Start.
Input: num.
Compute the square of num and store it in sq.
Convert sq to a string s with a leading zero.
Determine the length l of s.
Loop from 1 to l - 1:
Split s into two parts: lh (left half) and rh (right half).
Convert lh and rh to integers.
If rh is not zero and lh + rh equals num, return true.
If no valid split is found, return false.
End.

display Method
Start.
Print "THE KAPREKAR NUMBERS ARE:".
Initialize cnt to 0.
Loop from m to n:
If isKaprekar(i) is true, print i and increment cnt.
If cnt == 0, print "There are no Kaprekar Numbers in this Range".
Print "FREQUENCY OF KAPREKAR NUMBERS ARE:" and cnt.
End.

main Method
Start.
Create an instance of KaprekarNumberBoardProject.
Call the input method on the instance.
End.
	
 */
			
			
			
			
			
	


