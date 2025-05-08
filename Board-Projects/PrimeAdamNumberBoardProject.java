
package BoardPrograms;     //Board Project

import java.util.*;
public class PrimeAdamNumberBoardProject {
	private int m,n;
	
		
						public void input() {
						Scanner sc = new Scanner(System.in);
						
						System.out.print("Enter The Lower Limit(m): ");
						m = sc.nextInt();
						System.out.print("Enter The Upper Limit(n): ");
					
						n = sc.nextInt();
						if(m>=n || m<0) {
							System.out.print("\nINVALID INPUT");
							System.exit(0);
						}
							else
							display();
							sc.close();
						}

						public int reverse(int num) {
							int d,rev=0;
							while(num!=0) {
								d=num%10;
								rev=rev*10+d;
								num/=10;
							}
							return rev;
							}
						
						

						public boolean isPrime(int num) {
							int count = 0;
							for(int i = 1; i<num; i++) {
								if(num%i==0)
									count++;
							}
							if(count==1)
								return true;
							else 
								return false;
						}

							public boolean isAdam(int num) {
								int d,r= 0;
								int sq1 =num*num;
								int rev = reverse(num);
							
								int sq2 = rev*rev;
								while(sq2!=0) {
									d=sq2%10;
									r = r*10+d;
									sq2/=10;
								}
								if(r==sq1)
									return true;
								else
									return false;
							}

						public void display() {
							System.out.println();
						
							System.out.println("THE PRIME-ADAM NUMBERS ARE: ");
							int cnt = 0;
							for(int i = m; i<=n; i++) {
								if(isPrime(i)==true && isAdam(i)==true) {
									System.out.print(i+" ");
									cnt++;
								}
							}
							if(cnt==0)
								System.out.print("There are no Prime-Adam Numbers in this Range");
							System.out.println("\nFREQUENCY OF PRIME-ADAM NUMBERS ARE: " + cnt);
						}

	public static void main(String[] args) {
		PrimeAdamNumberBoardProject pa = new PrimeAdamNumberBoardProject();
		pa.input();
	}
}
				
				

				
				
				
					
					
					
				
				

