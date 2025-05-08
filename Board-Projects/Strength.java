package BoardPrograms;


import java.util.*;
public class Strength {
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("SENTENCE: ");
		String sent = sc.nextLine().toUpperCase().trim();
		int len = sent.length();
		char ch = sent.charAt(len-1);
		if(ch!='.'&&ch!='?'&&ch!='!') {
			System.out.print("INVALID INPUT");
			System.exit(0);
		}
		sent = sent.substring(0,len-1);
		len--;
		extract(sent,len,ch);
	}
	
	void extract(String s, int l, char c) {
		String w = "";
		int st = 0, ws = 0;
		for(int i = 0; i<l; i++) {
			c = s.charAt(i);
			if(Character.isWhitespace(c))
				ws++;
		}
		String[] word = new String[ws+1];
		int[] str = new int[ws+1];
		for(int i = 0, j = 0; i<l;  ) {
			c = s.charAt(i);
			while(c!=' '&&i<l) {
				c=s.charAt(i);
				w+=c;
				i++;
			}
			word[j]=w;
			str[j]=strength(w);
			j++;
			w="";
			
		}
		System.out.println("\nWORDS\t\tSTRENGTH\n");
		for(int i = 0; i<ws+1; i++) {
			System.out.println(word[i]+"\t\t"+str[i]);
		}
		int t1 = 0; String t = "";
		for(int i = 0; i<ws+1; i++) {
			for(int j = 0; j<ws-i; j++) {
				if(str[j]>str[j+1]) {
					t1=str[j];
					str[j]=str[j+1];
					str[j+1]=t1;
					
					t=word[j];
					word[j]=word[j+1];
					word[j+1]=t;
				}
			}
		}
		System.out.print("\nSORTED SENTENCE: ");
		for(int i = 0; i<ws+1; i++) {
			System.out.print(word[i]+" ");
		}
	}
	int strength(String s1) {
		int sum = 0;
		for(int i = 0; i<s1.length(); i++) {
			if(Character.isLetter(s1.charAt(i)))
				sum+=s1.charAt(i)-'A'+1;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Strength p = new Strength();
		p.input();
		
	}		
}
