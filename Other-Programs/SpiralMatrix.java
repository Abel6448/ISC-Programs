package Class12;

import java.util.Scanner;
public class SpiralMatrix {
	
	int len;
		
		
			public void getint() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of the array");
				len=sc.nextInt();
				
				int arr[][]=new int[len][len];
				
				System.out.println("Enter the elements of the array");
				for( int i=0;i<len;i++) {
					for(int j=0;j<len;j++) {
						arr[i][j]=sc.nextInt();
					}
				}
				
				
				
				
			}

}
