package BoardPrograms;

import java.util.*;

public class MatrixRowEquivalentBoard {
    public int A[][];
    public int M, N;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        M = sc.nextInt();

        if (M < 0 || M > 10) {
            System.out.println("Invalid Output");
            System.exit(0);
        }

        System.out.println("Enter the number of columns");
        N = sc.nextInt();

        if (N < 2 || N > 6) {
            System.out.println("Invalid Output");
            System.exit(0);
        }

        A = new int[M][N];

        System.out.println("Enter the values of the array");
        for (int i = 0; i < M; i++) {
            System.out.println("\nEnter the values for row " + (i + 1) + ":");
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        calc();
    }

    public void calc() {
        System.out.println("\nFilled Matrix" + "\t" + "\t"+ "Binary Equivalent");

        for (int i = 0; i < M; i++) {
            int sum = 0;
            int n = N - 1;
            for (int j = 0; j < N; j++) {
                sum += A[i][j] * Math.pow(8, n);
                n--;
            }

            // Print the matrix row
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
           
            // Print the sum (binary equivalent)
            System.out.println("\t" + "\t              " + sum);
        }
    }

    public static void main(String[] args) {
        MatrixRowEquivalentBoard w = new MatrixRowEquivalentBoard();
        w.get();
    }
}
