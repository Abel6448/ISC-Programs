package Class12;


import java.util.Scanner;

public class BinarySearch { // in a sorted array always
    int num;
    int start = 0; // Initialize start to 0
    int mid = 0;
    int arr[];
    boolean flag;
    

    public void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int len=sc.nextInt();
       int arr[]=new int[len];
       
        System.out.println("\nEnter Array Elements:");
        for(int i=0;i<len;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.print("\nEnter Element To Be Searched: ");
        num = sc.nextInt();
        int end = arr.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;

            if (num == arr[mid]) {
                System.out.println("\nFound "+num+" At Index Number: "+mid);
                flag = true;
                break;
            }

            if (num < arr[mid]) {
                end = mid - 1;
            } 
            
            else {
                start = mid + 1; // Update the start index
            }
        }

        if (flag==false) {
            System.out.println("\nThe given number is not in this array");
        }
    }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        b.search();
    }
}

