package BoardPrograms;

import java.util.*;
public class SymmetricMatrixBoard {
	int M;
	boolean flg=true;
	int arr[][];
		
			public void get() {
				Scanner sc=new Scanner(System.in);
						System.out.println("Enter the size of the matrix");
						M=sc.nextInt();
						
						if(M<2||M>10) {
							System.out.println("\nInvalid Input!!");
							System.exit(0);
							
						}
						arr=new int [M][M];
						System.out.println("\nEnter The Elements Of The Array");
						for(int i=0;i<M;i++) {
							for(int j=0;j<M;j++) {
								arr[i][j]=sc.nextInt();
							}
						}
						
						System.out.println("\nOriginal Matrix");
						for(int i=0;i<M;i++) {
							for(int j=0;j<M;j++) {
								System.out.print(arr[i][j]);
							}
							System.out.println();
						}
			}
						
						public void check() {
							
							for(int i=0;i<M;i++) {
								for(int j=0;j<M;j++) {
									if(arr[i][j]!=arr[j][i]) {
										flg=false;
									}
								}
							}
							
							if(flg==false) {
							System.out.println("\nNot A Symmetrical Matrix");
					}
							else
								System.out.println("\nThis Is A Symmetrical Matrix");
							
						}
						
						public void sum() {
							int leftdia = 0,rightdia=0;
							
							for(int i=0;i<M;i++) {
								leftdia+=arr[i][i];
								rightdia+=arr[i][M-1-i];
							}
							
							System.out.println("\nThe sum of Left Diagonal is: "+leftdia);
							System.out.println("\nThe sum of Right Diagonal is: "+rightdia);
						}

			
			public static void main(String[]args) {
				SymmetricMatrixBoard s=new SymmetricMatrixBoard();
				s.get();
				s.check();
				s.sum();
				
				}
			}
						
						
						
			

			
		
		
		
		
		
		
		
		

