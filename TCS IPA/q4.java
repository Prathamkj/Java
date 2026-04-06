// 
// inputt --- hey3 Java Lerners 
// outpur --- as
// removing the white spaces and also the digits and print the last characters
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ans = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Accessing each characters
            if (ch != ' ') {
                // build word
                word = word + ch;   
            } else {
                // word completed 
                // check digit
                if (!word.matches(".*\\d.*")) {
                    ans = ans + word.charAt(word.length() - 1);
                }
                word = ""; // reset
            }
        }

        // last word
        if (!word.matches(".*\\d.*")) {
            ans = ans + word.charAt(word.length() - 1);
        }

        System.out.println(ans);
    }
}

// 2nnd Approach 


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] nstr = str.split(" ");
        // split the string into words

        for (int i = 0; i < nstr.length; i++) {
            String word = nstr[i];
            // accessing each words
            boolean hasDigit = false;

            // check whole word
            // this loop for whole words...
            for (int j = 0; j < word.length(); j++) {
                if (Character.isDigit(word.charAt(j))) {
                    // check if it is digit in word 
                    hasDigit = true;
                    // then check the digit = true
                    break;
                }
            }   

            if (hasDigit) {
                continue;
                // if it is digit then skip the word
            }

            char ch = word.charAt(word.length() - 1);
            // Accessing the word last character and print the character 
            System.out.print(ch);
        }
    }
}