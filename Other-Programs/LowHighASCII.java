package Class12;

import java.util.*;
public class LowHighASCII {
		
			
					public void getinput() {
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter the word");
						String wrd=sc.nextLine().toUpperCase();
						
						char[] letters=wrd.toCharArray();
						select(letters);
					}
					
					public void select(char letters[]) {
						int lowest=123,highest=0;
						int num=0;
						for( int i=0;i<letters.length;i++) {
							num=letters[i];
							if(num<lowest) {
								lowest=num;
							}
							if(num>highest) {
								highest=num;
							}
						}
						print(lowest,highest);
						
					}
					
					public void print(int lowest,int highest) {
						System.out.print(lowest+","+highest);
					}
					
					
					public static void main(String[]args) {
						LowHighASCII a=new LowHighASCII ();
						a.getinput();
					}
					
					
					

}
