package Class12;

import java.util.*;
public class VowAndConsoTable {
	String[] array;
	
	
			public void input() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the sentence");
				String sent=sc.nextLine().toLowerCase();
				
				array=sent.split(" ");
				int v,c;
				System.out.println("Word \t Vowel \t Consonant");
				for (int i = 0; i < array.length; i++) {
		            String word = array[i];
		            	v=0;
		            	c = 0;
		            for (int j = 0; j < word.length(); j++) {
		                char ch = word.charAt(j);
		                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                    v++;
		                }
		                else  {
		                    c++;
		                }
		              
		            }
		            System.out.println(word+"\t  "+v+"\t   "+c);
		        }
				
			}
			
			public static void main(String[]args) {
				VowAndConsoTable v=new VowAndConsoTable();
				v.input();
					
			}

}
