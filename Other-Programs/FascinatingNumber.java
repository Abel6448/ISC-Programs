package Class12;

import java.util.Scanner;
class FascinatingNumber
{
	int num,len,temp;
	int mult=0;
	String lengthnum;
	int arr1[]= {1,2,3,4,5,6,7,8,9};
	int arr[]=new int[10];
	Boolean flg;
	
		public void getnum(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		sc.close();
			
			flg=true;
		

		 mult=num+num*2+num*3;
		int i=0;
		while(mult>0){
		arr[i]=mult%10;
		mult/=10;
		i++;
		}

		

		for(int a =0; a < i-1; a++){
			for(int b = 0; b <i-1-a; b++){
			if(arr[b]>arr[b+1]){
			temp=arr[b];
			arr[b]=arr[b+1];
			arr[b+1]=temp;
			}	
	}
		}
			
			
		
			
		
		
		for(int j=0;j<9;j++){
		if(arr[j]!=arr1[j]) {
			flg=false;
			break;
		}
	}
	
	
		if(flg!=true)
		System.out.println("The Number is a Fascinating Number!!");
		
	
		else
		System.out.println("The Number is not a Fascinating Number");
	}
		
		
		
	
	
		public static void main( String[] args){
		FascinatingNumber f=new FascinatingNumber();
		f.getnum();
}
}

	
	
		
		
	
	

		
		