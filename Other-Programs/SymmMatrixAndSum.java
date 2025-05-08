package Class12;

import java.util.*;

public class SymmMatrixAndSum{

	int A[][];
	int M;
	
	
		public void get() {
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter the size of the array");
			M=sc.nextInt();
			
			if(M<2||M>10) {
				System.out.println("INVALID INPUT!!");
				System.exit(0);
			}
			
			A=new int [M][M];
			
			System.out.println("\nEnter the elements of the array");
			
			for( int i=0;i<M;i++) {
				for( int j=0;j<M;j++) {
					A[i][j]=sc.nextInt();
				}
			}
		
			System.out.println("\nOriginal Matrix");
			for( int i=0;i<M;i++) {
				for(int j=0;j<M;j++) {
					System.out.print(A[i][j]+ " ");
				}
				System.out.println();
			}
}
				
		
			public void check() {
				boolean flg=true;
				for( int i=0;i<M;i++) {
					for( int j=0;j<M;j++) {
						if(A[i][j]!=A[j][i]) {
							flg=false;
						}
					}
				}
					
				if(flg==true) {
					System.out.println("\nThe given Matrix Is Symmetric");
				}
				else
					System.out.println("\nThe given Matrix Is Not Symmetric");
				
				
			}
			
			
			public void diasum() {
				int left=0;
				int right=0;
				
				for( int i=0;i<M;i++) {
					for(int j=0;j<M;j++) {
						if(i==j) {
							left+=A[i][j];
						}
						else if((i+j)==M) {
							right+=A[i][j];
						}
						
					}
				}
				
				System.out.println("\nThe Sum Of Left Diagonal = "+left);
				System.out.println("The Sum Of Right Diagonal = "+right);
			}
			
			
			public static void main(String[]args) {
				SymmMatrixAndSum s=new SymmMatrixAndSum();
				s.get();
				s.check();
				s.diasum();
			}
			
	
	
	
}
