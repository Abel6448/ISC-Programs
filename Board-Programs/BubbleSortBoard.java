package Class12;

import java.util.*;
public class BubbleSortBoard {
		
	int len,arr[];
	
		public void sort() {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the length of the array: ");
			len=sc.nextInt();
			
			int arr[]=new int[len];
			System.out.println("\nEnter the elements of the array: ");
			for(int i=0;i<len;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("\nThe Unsorted Array Is: ");
			for(int i=0;i<len;i++) {
				System.out.print(arr[i]+", ");
				
			}
			
			
			int temp=0;
			for(int i=0;i<len;i++) {
				for(int j=0;j<len-1;j++) {
					if(arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println();
			System.out.println("\nThe Sorted Array Is:");
			for(int i=0;i<len;i++) {
				System.out.print(arr[i]+", ");
			}
		}
		
		public static void main(String[]args) {
			BubbleSortBoard b=new BubbleSortBoard();
			b.sort();
		}

}
