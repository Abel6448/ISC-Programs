package Recursion;

import java.util.Scanner;
public class Factorial {

	int n1;
	
		public void accept() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			n1=sc.nextInt();
			
		}
		
		public int getFACTORIAL(int n1) {
			if(n1==0) {
				return 1;
			}
			return n1*getFACTORIAL(n1-1);
		}
		
		public void print() {
			int fact=getFACTORIAL(n1);
			System.out.println(fact);
		}
		
		public static void main(String[]args) {
			Factorial f=new Factorial();
			f.accept();
			f.print();
		}
}
