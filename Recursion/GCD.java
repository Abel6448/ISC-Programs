package Recursion;
import java.util.Scanner;
public class GCD {

		int n1,n2;
		
			public void accept() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the first number");
				n1=sc.nextInt();
				
				System.out.println("Enter the second number");
				n2=sc.nextInt();
				
				}
		
				int getGCD(int n1,int n2) {
					if(n1==0)
						return n2;
					return getGCD(n2%n1,n1);
				}
				
				public void print() {
					int g=getGCD(n1,n2);
					System.out.println(g);
				}
				
				public static void main(String[] args) {
					GCD g=new GCD();
					g.accept();
					g.print();
				}
}
					

		
		
		
			
		
		
		
		
		
	
		

