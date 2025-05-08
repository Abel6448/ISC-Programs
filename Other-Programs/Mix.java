package Class12;

import java.util.Scanner;

public class Mix {
    
    String wrd;
    int len;
    
    Mix() {
        len = 0;
        wrd = "";
    }
    
    	void feedword(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the first word");
    	wrd=sc.nextLine();
    }
    	
    	void mixword(Mix P, Mix Q) {
    		//int len=wrd.length();
    		String mixword="";
    		
    	if (P.wrd.length()-Q.wrd.length() > 0){
    		for(int i=0;i<Q.wrd.length();i++) {
    			mixword+=P.wrd.charAt(i);
    			mixword+=Q.wrd.charAt(i);
    		}
    		mixword+=P.wrd.substring(Q.wrd.length());
    	}
    	else if(P.wrd.length()-Q.wrd.length() < 0) {
    		for(int i=0;i<P.wrd.length();i++) {
    			mixword+=P.wrd.charAt(i);
    			mixword+=Q.wrd.charAt(i);
    		}
    		mixword+=Q.wrd.substring(P.wrd.length());    		
    	}
    	
    	else {
    		for(int i=0;i<P.wrd.length();i++) {
    			mixword+=P.wrd.charAt(i);
    			mixword+=Q.wrd.charAt(i);
    			
    		}
    	}
    	System.out.println(mixword);
    }
    	
        public static void main(String[] args) {
            Mix mix1 = new Mix();
            Mix mix2 = new Mix();
            Mix result = new Mix();

            mix1.feedword();
            mix2.feedword();
            result.mixword(mix1, mix2);
        }
    

        

}
    
   