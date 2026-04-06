// This question is for count all the lowercase letters in the input String


import java.util.*;
class IPA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // now java
        String str = sc.nextLine();
        // taking string as a input
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // taking out the characters of all
            if(ch > 'a' && ch < 'z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
