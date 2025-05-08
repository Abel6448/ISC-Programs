package BoardPrograms;

import java.util.*;

public class ArrayChars {
    
    char char1, char2, char3; 
    int size;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        size = sc.nextInt();
        
        System.out.println("Enter the first character (for corners): ");
        char1 = sc.next().charAt(0);
        
        System.out.println("Enter the second character (for middle elements): ");
        char2 = sc.next().charAt(0);
        
        System.out.println("Enter the third character (for remaining elements): ");
        char3 = sc.next().charAt(0);
        
        put(); 
    }
    
    public void put() {
        char[][] arr = new char[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == size - 1) || 
                    (i == size - 1 && j == 0) || (i == size - 1 && j == size - 1)) {
                    arr[i][j] = char1; 
                    
                } else if (size % 2 == 1 && i == size / 2 && j == size / 2) {
                    arr[i][j] = char2; 
                    
                } else if (size % 2 == 0 && 
                           (i == size / 2 - 1 || i == size / 2) &&
                           (j == size / 2 - 1 || j == size / 2)) {
                    arr[i][j] = char2; 
                    
                } else {
                    arr[i][j] = char3;
                }
            }
        }	
        print(arr); 
    }

    public void print(char[][] arr) {
    	System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }   
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        ArrayChars a = new ArrayChars();
        a.input(); 
    }
}
