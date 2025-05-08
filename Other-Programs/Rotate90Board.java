package Class12;
import java.util.*;
public class Rotate90Board {
	
	int M,sum=0;
	 int[][] arr;
	
			public void getandrotate() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter The Size Of The Array");
				int M=sc.nextInt();
				
				if(M<2||M>10) {
					System.out.println("Invalid Input!!");
					System.exit(0);
					}
					
				int[][] arr =new int [M][M];
				
				System.out.println("Enter The Elements Of The Array");
				for( int i=0;i<M;i++) {
					for( int j=0;j<M;j++) {
						arr[i][j]=sc.nextInt();
					}
				}
				
				System.out.println("\nOriginal Matrix: ");
				for( int i=0;i<M;i++) {
					for( int j=0;j<M;j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}

				System.out.println("\nRotated Matrix: ");
				
				for( int j=0;j<M;j++) {
					for(int i=(M-1);i>=0;i--) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				
					sum+=arr[0][0]+arr[0][M-1]+arr[M-1][0]+arr[M-1][M-1];
					System.out.println("\nSum Of Corner Elements Is: " + sum);


		
			}
				
				
				
			

		public static void main(String[]args) {
			Rotate90Board r=new Rotate90Board();
			r.getandrotate();
		//	r.cornersum();
			
		}
}
