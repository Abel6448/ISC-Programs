package Class12;

import java.util.Scanner;
public class EvilNumber {
	int dec,d,ctr=0;
	String bin="";
	
		public void getdec() {
			Scanner sc=new Scanner(System.in);
			System.out.print("\nEnter the number: ");
			dec=sc.nextInt();
			sc.close();
			
			while(dec>0) {
				d=dec%2;
				bin +=d;
				dec/=2;
				
				if(d==1) {
					ctr++;
				}
				
				
			}
			System.out.println("\nBinary Equivalent:"+bin);
			System.out.println("\nNumber of 1's: "+ctr);
			if(ctr%2==0) {
				System.out.println("\nEvil Number");
				
			}
			else 
				System.out.println("\nNot an Evil Number");
			
			
			
		}
		public static void main(String[]args) {
			EvilNumber e=new EvilNumber();
			e.getdec();
		}
}
