package Class12;

import java.util.Scanner;

public class DoublyMarkovMatrix {

    int[][] arr;
    int m;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        m = sc.nextInt();

        arr = new int[m][m]; // Initialize the class-level array

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();

                if (arr[i][j] < 0) { // Assuming matrix elements should be non-negative
                    System.out.println("Matrix elements must be non-negative.");
                    return; // Stop further execution
                }
            }
        }
    }

    public void check() {
        boolean isDoublyMarkov = true;
      
        // Check row sums
        for (int i = 0; i < m; i++) {
        	int sumRow = 0;
            for (int j = 0; j < m; j++) {
                sumRow += arr[i][j];
            }
            if (sumRow != 1) {
                isDoublyMarkov = false;
                break;
            }
        }
        
        // Check column sums
        if (isDoublyMarkov) {
            for (int j = 0; j < m; j++) {
                int sumColumn = 0;
                for (int i = 0; i < m; i++) {
                    sumColumn += arr[i][j];
                }
                if (sumColumn != 1) {
                    isDoublyMarkov = false;
                    break;
                }
            }
        }

        if (isDoublyMarkov) {
            System.out.println("This is a Double Markov Matrix.");
        } else {
            System.out.println("This is not a Double Markov Matrix.");
        }
    }

    public static void main(String[] args) {
        DoublyMarkovMatrix d = new DoublyMarkovMatrix();
        d.get();
        d.check();
    }
}
