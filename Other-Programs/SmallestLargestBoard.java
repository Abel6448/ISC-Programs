package Class12;

import java.util.*;
public class SmallestLargestBoard {
	
	int M, N;
	int A[][];

	public void get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows in the array:");
		M = sc.nextInt();
		
		if (M < 2 || M > 20) {
			System.out.println("INVALID INPUT!!");
			System.exit(0);
		}
		
		System.out.println("\nEnter number of columns in the array:");
		N = sc.nextInt();
		
		if (N < 2 || N > 20) {
			System.out.println("\nINVALID INPUT!!");
			System.exit(0);
		}
		
		A = new int[M][N];
		
		System.out.println("\nEnter the elements of the array:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nORIGINAL MATRIX");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		find();
	}
	
	public void find() {
		int max = A[0][0]; //Integer.MIN_VALUE;
		int min = A[0][0];  //Integer.MAX_VALUE; 
		int r = 0, c = 0;
		int x = 0, y = 0;
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (A[i][j] > max) {
					max = A[i][j];
					r = i;
					c = j;
				} else if (A[i][j] < min) {
					min = A[i][j];
					x = i;
					y = j;
				}
			}
		}
		
		System.out.println("\nLargest Number is: " + max + " at " + r + "," + c);
		System.out.println("\nSmallest Number is: " + min + " at " + x + "," + y);
		
		switchto1darray();
	}
	
	public void switchto1darray() {
		int l = 0;
		int[] Arr = new int[M * N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				Arr[l] = A[i][j];
				l++;
			}
		}
		sort(Arr);
	}
	
	public void sort(int[] Arr) {
		int temp = 0;
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length - 1; j++) {
				if (Arr[j] > Arr[j + 1]) {
					temp = Arr[j];
					Arr[j] = Arr[j + 1];
					Arr[j + 1] = temp;
				}
			}
		}
		switchto2darrayandprint(Arr);
	}
	
	public void switchto2darrayandprint(int[] Arr) {
		System.out.println("\n Rearranged Matrix: ");
		int k = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = Arr[k];
				k++;
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		SmallestLargestBoard s = new SmallestLargestBoard();
		s.get();
	}
}
