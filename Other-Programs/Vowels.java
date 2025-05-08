package Class12;

import java.util.*;
public class Vowels {
	
	String wrd,newwrd;
			
			Vowels(){
				wrd="";
				newwrd="";
			}
		
			void readwrd() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the scentence");
			 wrd	=sc.nextLine().toUpperCase();
		}
			
			void freq_vow_con() {
				int vow = 0,conso=0;
			for( int i=0;i<wrd.length();i++) {
				char ch=wrd.charAt(i);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					vow++;
				}
				else
					conso++;
			}
			System.out.println("There are "+vow+" Vowels"+"and "+conso+" consonants");
		}
			
		void arrange() {
			String p="";
			String q="";
			for(int i=0;i<wrd.length();i++) {
				char ch=wrd.charAt(i);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					p+=ch;
				}
				else 
					q+=ch;
				
			}
			newwrd=p+q;
		}
			void display() {
				System.out.println(wrd+" changes to "+newwrd);

			}
			
			
			public static void main(String[]args) {
				Vowels v=new Vowels();
			
				v.readwrd();
				v.freq_vow_con();
				v.arrange();
				v.display();
			}

	

	
		
	
		
		
		
		
		
		
			
		
		
		
			
		
				
		
			
		
		
		
		
		
		
	

}
