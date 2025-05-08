package BoardPrograms;

import java.util.Scanner;

public class UniqueNumberBoard {
    int m, n;

    		public void input() {
    			Scanner sc = new Scanner(System.in);
    			System.out.print("\n INPUT: m =");
    			m = sc.nextInt();
    			System.out.print("        n =");
    			n = sc.nextInt();
    			sc.close();
    			if(m>n||n>=3000) {
    				System.out.print("\nINVALID INPUT");
					System.exit(0);
    				
    			}
    			
    			
    			int cnt=0;

    			System.out.println("\nThe Unique-Digit Integers Are:");
    			for (int i = m; i <= n; i++) {
    				if (hasUniqueDigits(i)) {
    					cnt++;
    					System.out.print(i+", ");
    				}
    			}
    			 System.out.println("\nFrequency of Unique-Digit Integers Is: " +cnt);
    		}

  
    		private boolean hasUniqueDigits(int number) {
    			int[] digitCount = new int[10]; 

       
    			while (number > 0) {
    				int digit = number%10; 
    				digitCount[digit]++; 
    				if (digitCount[digit] > 1) {
    					return false; 
    				}
    				number /= 10; 
    			}

    			return true;
    		}

    		public static void main(String[] args) {
    			UniqueNumberBoard uniqueNumberBoard = new UniqueNumberBoard();
    			uniqueNumberBoard.input();
    		}
	}
