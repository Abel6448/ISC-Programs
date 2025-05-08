package Class12;

import java.util.Scanner;

public class MatrixSort {
    static int m;
    static int[][] a;

    public static void sortMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Matrix Size (M): ");
        m = sc.nextInt();

        if (m <= 3 || m >= 10) {
            System.out.println("The matrix size is out of range.");
            System.exit(0);
        }

        a = new int[m][m];
        System.out.println("Enter Elements of Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] < 0) {
                    System.out.println("Invalid input");
                    System.exit(0);
                }
            }
        }

        System.out.println("\nOriginal Matrix");
        printMatrix();

        sortNonBoundaryMatrix();
        System.out.println("\nRearranged Matrix");
        printMatrix();

        computePrintDiagonalSum();
    }

    public static void sortNonBoundaryMatrix() {
        int[] b = new int[(m - 2) * (m - 2)];
        int k = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                b[k++] = a[i][j];
            }
        }

        // Manual sorting (bubble sort)
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }

        k = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                a[i][j] = b[k++];
            }
        }
    }

    public static void computePrintDiagonalSum() {
        int sum = 0;
        System.out.println("\nDiagonal Elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == m - 1) {
                    sum += a[i][j];
                    System.out.print(a[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("\nSum of the Diagonal Elements = " + sum);
    }

    public static void printMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        sortMatrix();
    }
}


















































