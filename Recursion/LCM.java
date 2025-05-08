package Recursion;
import java.util.Scanner;
public class LCM {
	int n1,n2,l,large=0,small=0;;
	
			void accept() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the 1st number");
				n1=sc.nextInt();
				System.out.println("Enter the 2nd number");
				n2=sc.nextInt();
				
				if(n1>n2) {
					large=n1;
				small=n2;
				}
				else {
					small=n1;
					large=n2;
				}
			}
			
			public int getLCM() {
			    if (large != small) {
			        if (large > small) {
			            large -= small;
			        } else {
			            small -= large;
			        }
			        return getLCM(); 
			    } else {
			        return (n1 * n2) / large; 
			    }
			}
			
			public void print() {
				int l= getLCM();
				System.out.println(l);
				
			}
			
			public static void main(String []args) {
				LCM l=new LCM();
				l.accept();
				l.print();
			}
}
