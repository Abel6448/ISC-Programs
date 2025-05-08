package BoardPrograms;

import java.util.*;

public class WordDeletion {

    String str;
    int index;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        str = sc.nextLine();

        // Check if the last character is punctuation
        char last = str.charAt(str.length() - 1);

        if (last != '.' && last != '?' && last != '!' && last != ',') {
            System.exit(0);
        }
        System.out.println("Enter the Word to be deleted:");
        System.out.println("Enter the index of the word");
        index = sc.nextInt();
    }

    public void separate() {
        // Initialize variables for word formation and sentence
        int k = 0;
        String word = "";
        String sentence = "";

        // Add an extra space at the end of the string to simplify word extraction
        str = str + " "; // Minimal change to handle the last word

        // Loop through each character to form words
        while (k < str.length()) {
            char ch = str.charAt(k);

            if (ch != ' ') {
                word += ch;  // Add character to current word
            } else {
                if (!word.isEmpty()) {
                    sentence += word + " ";  // Add the formed word to the sentence
                    word = "";  // Reset the word
                }
            }
            k++;
        }

        // Count words manually by counting spaces
        int cnt = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                cnt++;
            }
        }

        // Create an array to store the words
        String[] words = new String[cnt];
        int w = 0;
        word = "";

        // Loop through the sentence and form words
        for (int i = 0; i < sentence.length(); i++) {
            char th = sentence.charAt(i);
            if (th != ' ') {
                word += th;  // Add character to the current word
            } else {
                if (!word.isEmpty()) {
                    words[w] = word;  // Add the word to the array
                    w++;
                    word = "";  // Reset word
                }
            }
        }

        // Print all words except the one at the given index
        for (int i = 0; i < words.length; i++) {
            if (i != index) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();  // New line after printing
    }

    public static void main(String[] args) {
        WordDeletion w = new WordDeletion();
        w.get();
        w.separate();
    }
}
