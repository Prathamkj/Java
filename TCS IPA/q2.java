// Remove Duplicates from the String

import java.util.*;
class Ipa{
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // taking string input
        String ans = "";
        for(int i=0; i<str.length(); i++){
            // let's take one character one by one
            char ch = str.charAt(i);
            // now check if character is present or not
            if(ans.indexOf(ch) == -1){
                // if not present then 
                ans = ans + ch;
            }
        }
        System.out.println(ans);
    }
}

/*
if (ans.indexOf(ch) == -1)
indexOf(ch) → finds position of character
returns -1 → means NOT present
so we add only unique characters
*/