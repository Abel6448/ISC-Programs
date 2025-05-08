package BoardPrograms;

import java.util.*;

public class CaesarCiphir {

    String str;

    
    char[] lowercase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] uppercase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        str = sc.nextLine();

        System.out.println("\nThe cipher text is: ");
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (Character.isUpperCase(ch)) {
                
                for (int j = 0; j < uppercase.length; j++) {
                    if (ch == uppercase[j]) {
                        int newIndex = (j + 13) % 26; 
                        System.out.print(uppercase[newIndex]);
                        break;
                    }
                }
            }
         
            else if (Character.isLowerCase(ch)) {
            
                for (int j = 0; j < lowercase.length; j++) {
                    if (ch == lowercase[j]) {
                        int newIndex = (j + 13) % 26; 
                        System.out.print(lowercase[newIndex]);
                        break;
                    }
                }
            }
           
            else {
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {
        CaesarCiphir c = new CaesarCiphir();
        c.get();
    }
}
