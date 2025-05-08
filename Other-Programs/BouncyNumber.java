	
	/*A number is said to Bouncy number if the digits of the number are unsorted.
	
	For example,
	22344 - It is not a Bouncy number because the digits are sorted in ascending order.
	774410 - It is not a Bouncy number because the digits are sorted in descending order.
	155349 - It is a Bouncy number because the digits are unsorted.
	A number below 100 can never be a Bouncy number.
	
	Write a program in java to accept a number. Check and display whether it is a Bouncy number or not.*/
	
	package Class12;
	import java.util.Scanner;
	public class BouncyNumber {
			
			int num,alt1,alt2;
			int cnt=0;
			Boolean flg;
			
				
					public void get() {
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter Your Number");
						num=sc.nextInt();
						
						if(num<100) {	
							System.out.println("This number is not a Bouncy Number");
							return;
						}
						
						flg=true;
						
						alt1=num;
						alt2=num;
						
						
						while(alt1>0) {
							alt1/=10;
							cnt++;
						}
						
						int arr[]=new int[cnt];
						
						int i=0;
						while(alt2>0) {
						arr[i]=alt2%10;
						alt2/=10;
						i++;
						}
						
						for(int j=0;i<cnt;j++) {
							if(arr[j]<arr[j+1]) {
								flg=false;
								break;
							}
					
							
							
						}
						
						if(flg==false) {
							System.out.println("This number is not a Bouncy Number");
						}
						
						else 
							System.out.println("This number is a Bouncy Number ");
							
						
						
					}
					
					public static void main(String[]args) {
						BouncyNumber b=new BouncyNumber();
						b.get();
					}
		
	
	}
