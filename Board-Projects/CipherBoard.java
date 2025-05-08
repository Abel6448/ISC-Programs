package BoardPrograms;

import java.util.*;
public class CipherBoard {
	
	int N;
	public static char arr[][];
	char f,s,t;
	
			public void get() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Size of the array");
			N=sc.nextInt();
			
			System.out.println("Enter The First Character: ");
			f=sc.next().charAt(0);
			
			System.out.println("Enter The Second Character: ");
			s=sc.next().charAt(0);
			
			System.out.println("Enter The Third Character: ");
			t=sc.next().charAt(0);
			
			char arr[][]=new char[N][N];
			fill(arr);
			}
			
				public void fill(char [][] arr) {
				for(int i=0;i<N;i++) {
					for(int j=0;j<N;j++) {
						if(i==j) {
							arr[i][j]=f;
						}
						else if(i+j==N-1) {
							arr[i][j]=f;
						}
						else 
							arr[i][j]=s;
						
						
					}
				}
				
				for(int i=1;i<N;i++) {
					for(int j=1;j<N;i++) {
						arr[i][j]=s;
					}
					
				}
				display(arr);
				
			}
			public void display(char [][]arr) {
				for(int i=0;i<N;i++) {
					for(int j=0;j<N;j++) {
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}
			}
			
				public static void main(String agrs[]) {
					CipherBoard c=new CipherBoard();
					c.get();
					c.fill(arr);
					c.display(arr);
				}
}
				
				
				
				
				
				
				
				
			


