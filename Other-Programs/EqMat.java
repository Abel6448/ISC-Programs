package Class12;
import java.util.*;
public class EqMat {
 int n,m;
 int a[][];
 
 			public void EqMat(int mm,int nn) {
 				m=mm;
 				n=nn;
 				int a[][]=new int[m][n];
 				
 			}
 			
 			public void readarray() {
 				Scanner sc=new Scanner(System.in);
 				System.out.println("Enter the values of first array");
 				for(int i=0;i<m;i++) {
 					for(int j=0;j<n;j++) {
 						a[i][j]=sc.nextInt();
 					}
 				}
 				//sc.close();
 			}
 				
 			
 			public int check(EqMat p,EqMat q) {
 				boolean flg=false;
 				for(int i=0;i<m;i++) {
 					for(int j=0;j<n;j++) {
 						if(p.a[i][j]==q.a[i][j]) {
 							 flg=true;
 							
 						}
 						else 
 							flg=false;
 						
 						
 					}
 					
 				}
 					if(flg==true) 
 						return 1;
 					
 					else 
 						return 0;
 				
 			}
 			
 			public void print() {
 				for( int i=0;i<m;i++) {
 					for( int j=0;j<n;j++) {
 						System.out.println(a[i][j]);
 					}
 				}
 			}

 			public static void main(String[]args) {
 				EqMat e=new EqMat();
 				e.EqMat(3, 3);
 				e.readarray();
 				
 			}
 		}
