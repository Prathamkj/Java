//  Reverse the Words in the String
// Most important code
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // taking input of the string 
        // getting word
        String[] word = str.split(" ");
        // to store the ans 
        String ans = "";
        // final string
        // seprate all the words by the space
        for(int i = word.length - 1; i >= 0; i--){
            // search from behind of the string and add to the updated string of ans
            ans = ans + word[i] + " ";
        }
        System.out.println(ans);
    }
}