/*
 * Class Name OddEven
 * 
 * methods 
 * OddEven(int mm) m=mm and ini array
 * void fillarray() enter elements of the array 
 * OffEven arrange(OddEven ), OddEven Q)  stores the odd numbers from both the parameterized objects arrays followed by the even numbers from both the array and returns the object with arranged arrays
 * void display()
 */
package Class12;
import java.util.*;
public class OddEven {
	int m;
	int a[];
		
				OddEven(int mm) {
				m=mm;
				a=new int [mm];
			}	
				
				void fillarray() {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter elements of the array");
					for( int i=0;i<m;i++) {
						a[i]=sc.nextInt();
					}
				}
				
				
				OddEven arrange(OddEven P, OddEven Q) {
					int k=0;
					OddEven res=new OddEven(P.m+Q.m);
					for( int i=0;i<P.m;i++) {
						if(P.a[i]%2!=0) {
							res.a[k++]=P.a[i];
						}
					}
					for( int i=0;i<5;i++) {
						if(P.a[i]%2!=0) {
							res.a[k++]=Q.a[i];
						}
					}
					return res;
					
				}
	
			
				void display() {
					System.out.println("The Resultant Array is:");
					for(int i=0;i<10;i++) {
						System.out.println(a[i]);
					}
				}
				
				public static void main(String []args) {
					OddEven ob1=new OddEven(5);
					OddEven ob2=new OddEven(5);
					ob1.fillarray();
					ob2.fillarray();
					
					OddEven r=new OddEven(10);
					OddEven res=r.arrange(ob1, ob2);
					res.display();
				}
				
				
				
				

}
