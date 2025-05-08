package Class12;

import java.util.Scanner;
public class UniqueNumber {
	int r,l,num,cnt=0;

	boolean flg=false;
	
		public void getnum() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			num=sc.nextInt();
			r=num;
			while(r>0) {
				cnt++;
				r/=10;
			}
			int arr[] =new int[cnt];
			int i=0;
			while( num>0) {
				arr[i]=num%10;
				num/=10;
				i++;
			}
			sc.close();
			
			for(int a=0;a<cnt;a++) {
				for(int b=a+1;b<cnt;b++) {
					
				if(arr[a]==arr[b]) {
					flg=true;
				}
				}
			}
				if(flg==false) {
					System.out.println("The entered number is an Unique Number");
				}
				
				else 
					System.out.println("The entered number is not an Unique Number");
			
		}
		
		public static void main(String[]args) {
			UniqueNumber u=new UniqueNumber();
			u.getnum();
		}

}
