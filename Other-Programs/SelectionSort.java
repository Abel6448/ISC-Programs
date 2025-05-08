package Class12;

import java.util.Scanner;
public class SelectionSort {
	
	int min,len;
	int temp=0;
	
		public void getinfo() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of the array");
			len=sc.nextInt();
			
			int arr[]=new int[len];
			
			System.out.println("Enter the elements of the array");
			for(int i=0;i<len;i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i=0;i<len;i++) {
				min=i;
				
				for(int j=1+1;j<len;j++) {
					if(arr[j]<arr[min]) {
						min=j;
					}
				}
				temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
			
			System.out.println("The sorted array is:");
			for ( int i=0;i<len;i++) {
				System.out.println(arr[i]);
			}
			
		
		}
	
		public static void main(String[]args) {
			SelectionSort s=new SelectionSort();
			s.getinfo();
		}

}
