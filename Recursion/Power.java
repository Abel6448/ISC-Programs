package Recursion;
import java.util.Scanner;
public class Power {

	
	int num,pow;
	
		public void accept() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			num =sc.nextInt();
			
			System.out.println("Enter the power");
			pow =sc.nextInt();
			
			
		}
		
		public int getPOWER(int num,int pow) {
			if(pow==0) {
				return 1;
			}
			
				return num*getPOWER(num,pow-1);
		}
		
		public void print() {
			int p=getPOWER	(num,pow);
			System.out.println(p);
		}
		
		public static void main(String[]args) {
			Power p=new Power();
			p.accept();
			p.print();
		}
}
